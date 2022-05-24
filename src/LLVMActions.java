

import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;


enum VarType{INT, FLOAT, ID, intARRAY, floatARRAY, STRING, FUNCTION}
class Value{
    public String name;
    public VarType type;
    public Value (String name, VarType type)
    {
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions extends GramatykaBaseListener {



    HashSet<String> globalnames = new HashSet();
    HashSet<String> functions = new HashSet<>();
    HashSet<String> localnames = new HashSet<>();

    HashMap<String, VarType> variables = new HashMap<>();
    HashMap<String, String> localVariables = new HashMap<>();
    HashMap<String, String> variableValues = new HashMap<>();
    HashMap<String, Integer> arraySize = new HashMap<>();

    Stack<Value> stack = new Stack<>();
    Stack<Value> stackArr = new Stack<>();

    String function;
    Boolean global;
    @Override
    public void enterProg(GramatykaParser.ProgContext ctx) {
        global = true;
    }

    @Override
    public void exitCall(GramatykaParser.CallContext ctx) {
        String ID = ctx.ID().getText();
        if(functions.contains(ID)) {
            LLVMGenerator.callfunction(ID);
        } else {
            error(ctx.getStart().getLine(), ID + " is not a fuction");
        }
    }

    @Override
    public void exitFparam(GramatykaParser.FparamContext ctx) {
        String ID = ctx.ID().getText();
        if (!variables.containsKey(ID)) {
            variables.put(ID, VarType.FUNCTION);
            functions.add(ID);

            function = ID;
            LLVMGenerator.functionstart(ID);
        } else {
            error(ctx.getStart().getLine(), "Name " + ID + " already declared");
        }
    }

    @Override
    public void enterBlockfunction(GramatykaParser.BlockfunctionContext ctx) {
        global = false;
    }

    @Override
    public void exitBlockfunction(GramatykaParser.BlockfunctionContext ctx) {
        if(!localVariables.containsKey(function) ){
            localVariables.put(function, "function");
            LLVMGenerator.declare_i32(function, false);
            LLVMGenerator.assign_i32("%" + function, "0");
        }
        LLVMGenerator.load_i32("%" + function);
        LLVMGenerator.functionend();
        localVariables = new HashMap<>();

        global = true;
    }

    @Override
    public void exitRepetitions(GramatykaParser.RepetitionsContext ctx) {
        Value value = stack.pop();
        String outRepeat = "";
        if( value.type == VarType.ID ){
            String ID = value.name;
            if( variables.containsKey(ID) ) {
                if(ID.equals("int")) {
                    LLVMGenerator.load_i32(ID);
                    outRepeat = "%" + (LLVMGenerator.reg - 1);
                } else {
                    error(ctx.getStart().getLine(), "Mismatch type in loop");
                }
            } else {
                error(ctx.getStart().getLine(), "unknown variable "+ID);
            }
        }

        if( value.type== VarType.INT ){
            outRepeat = value.name;
        }else {
            error(ctx.getStart().getLine(), "Mismatch type in loop");
        }

        LLVMGenerator.repeatstart(outRepeat);
    }

    @Override
    public void exitBlockfor(GramatykaParser.BlockforContext ctx) {
        if( ctx.getParent() instanceof GramatykaParser.LoopContext ){
            LLVMGenerator.repeatend();
        }
    }

    @Override
    public void enterBlockif(GramatykaParser.BlockifContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(GramatykaParser.BlockifContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override
    public void exitEqualsIf(GramatykaParser.EqualsIfContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (variables.containsKey(ID)){
            LLVMGenerator.icmp(set_variable(ID,VarType.INT), INT, "=");
        }else{
            ctx.getStart().getLine();
            System.err.println("Line " + ctx.getStart().getLine()+", unknown variable: " + ID);
        }
    }

    @Override
    public void exitIsBiggerIf(GramatykaParser.IsBiggerIfContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (variables.containsKey(ID)){
            LLVMGenerator.icmp(set_variable(ID,VarType.INT), INT, ">");
        }else{
            ctx.getStart().getLine();
            System.err.println("Line " + ctx.getStart().getLine()+", unknown variable: " + ID);
        }
    }

    @Override
    public void exitIsSmallerIf(GramatykaParser.IsSmallerIfContext ctx) {
        String ID = ctx.ID().getText();
        String INT = ctx.INT().getText();
        if (variables.containsKey(ID)){
            LLVMGenerator.icmp(set_variable(ID,VarType.INT), INT, "<");
        }else{
            ctx.getStart().getLine();
            System.err.println("Line " + ctx.getStart().getLine()+", unknown variable: " + ID);
        }
    }

    @Override
    public void enterWrongStat(GramatykaParser.WrongStatContext ctx)  {
        error(ctx.getStart().getLine(), "wrong statement " + ctx.getText());
    }

    @Override
    public void exitProg(GramatykaParser.ProgContext ctx) {
        LLVMGenerator.close_main();
        System.out.println( LLVMGenerator.generate() );
  }

    @Override
    public void exitDeclareArray(GramatykaParser.DeclareArrayContext ctx) {

        String Type = ctx.typeArray().getText();
        String ID = ctx.ID().getText();
        int size = stackArr.size();
        arraySize.put(ID,size);

        if(!variables.containsKey(ID)) {
            switch (Type) {
                case "intArray" -> {
                    variables.put(ID, VarType.intARRAY);
                    LLVMGenerator.declare_intArray(ID, size);
                    while (stackArr.size() > 0) {
                        Value value = stackArr.pop();
                        String name = value.name;
                        if (value.type != VarType.INT) {
                            error(ctx.getStart().getLine(), name + " Wrong value in the array");
                        }
                        LLVMGenerator.assign_intArray(ID, name, size, stackArr.size());
                    }
                }
                case "floatArray" -> {
                    variables.put(ID, VarType.floatARRAY);
                    LLVMGenerator.declare_floatArray(ID, size);
                    while (stackArr.size() > 0) {
                        Value value = stackArr.pop();
                        String name = value.name;
                        if (value.type != VarType.FLOAT) {
                            error(ctx.getStart().getLine(), name + " Wrong value in the array");
                        }

                        LLVMGenerator.assign_floatArray(ID, name, size, stackArr.size());
                    }
                }
            }
        }else{
            error(ctx.getStart().getLine(), ID + " already defined");
        }
    }

    @Override
    public void exitArrayValueInt(GramatykaParser.ArrayValueIntContext ctx) {
        List values = ctx.INT();

        for(Object value:values) {
            stackArr.push(new Value(value.toString(), VarType.INT));
        }
    }

    @Override
    public void exitArrayValueFloat(GramatykaParser.ArrayValueFloatContext ctx) {
        List values = ctx.FLOAT();

        for(Object value:values) {
            stackArr.push(new Value(value.toString(), VarType.FLOAT));
        }
    }

    @Override
    public void exitWrite(GramatykaParser.WriteContext ctx) {
        String ID = ctx.ID().getText();
        VarType type = variables.get(ID);
        if( type != null ) {
            if( type == VarType.INT ){
                LLVMGenerator.printf_i32( set_variable(ID, VarType.INT) );
            }
            if( type == VarType.FLOAT ){
                LLVMGenerator.printf_double( set_variable(ID, VarType.FLOAT) );
            }
            if(type == VarType.intARRAY){
                LLVMGenerator.printf_arrayIntAt(ID,arraySize.get(ID),0);
            }
            if(type == VarType.floatARRAY){
                LLVMGenerator.printf_arrayFloatAt(ID,arraySize.get(ID),0);
            }
            if(type == VarType.STRING){
                LLVMGenerator.printf_string(ID,variableValues.get(ID).length());
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    @Override
    public void enterWriteArrayAt(GramatykaParser.WriteArrayAtContext ctx) {
        String ID = ctx.ID().getText();
        int index = Integer.parseInt(ctx.INT().getText());

        if(index>arraySize.get(ID) - 1 || index < 0){
            error(ctx.getStart().getLine(), "wrong index value");
        }

        VarType type = variables.get(ID);
        if( type != null ) {
            if(type == VarType.floatARRAY){
                LLVMGenerator.printf_arrayFloatAt(ID,arraySize.get(ID),index);
            }
            if(type == VarType.intARRAY){
                LLVMGenerator.printf_arrayIntAt(ID,arraySize.get(ID),index);
            }
        } else {

            error(ctx.getStart().getLine(), "unknown variable "+ID);
        }
    }

    @Override
    public void exitAssign(GramatykaParser.AssignContext ctx) {
        String ID = ctx.ID().getText();
        Value v = stack.pop();

        if(global){
            if (globalnames.contains(ID)) {
                error(ctx.getStart().getLine(), "variable already defined "+ID);
            }
        }else{
            if (localnames.contains(ID)) {
                error(ctx.getStart().getLine(), "variable already defined "+ID);
            }
        }



        variables.put(ID, v.type);

        if (v.type == VarType.INT) {
            LLVMGenerator.assign_i32(set_variable(ID, VarType.INT), v.name);
        }
        if (v.type == VarType.FLOAT) {
            LLVMGenerator.assign_double(set_variable(ID, VarType.FLOAT), v.name);
        }
        if (v.type == VarType.ID) {

            if (variables.get(v.name) == VarType.FLOAT) {

                LLVMGenerator.assign_double(set_variable(ID, VarType.FLOAT), variableValues.get(v.name));
                variables.replace(ID, VarType.FLOAT);
                variableValues.replace(ID, variableValues.get(v.name));
            }

            if (variables.get(v.name) == VarType.INT) {

                set_variable(ID, VarType.INT);
                LLVMGenerator.assign_i32(ID, variableValues.get(v.name));
                variables.replace(ID, VarType.INT);
                variableValues.replace(ID, variableValues.get(v.name));
            }
        }

    }

    @Override
    public void exitRead(GramatykaParser.ReadContext ctx) {

        String ID = ctx.ID().getText();

        if(!variables.containsKey(ID)){
                variables.put(ID, VarType.INT);
                set_variable(ID, VarType.INT);
        }else
        {
            error(ctx.getStart().getLine(), "already declared");
        }

        LLVMGenerator.scanf(set_variable(ID,VarType.INT));
    }
    @Override
    public void exitNewString(GramatykaParser.NewStringContext ctx) {
        String ID = ctx.ID().getText();

        if (variables.containsKey(ID)) {
            error(ctx.getStart().getLine(), "variable already defined "+ID);
        }
        variables.put(ID, VarType.STRING);
        String value = ctx.STRING().getText();
        value = value.substring(1, value.length()-1);
        variableValues.put(ID, value);
        LLVMGenerator.declare_string(ID, value, value.length());

    }


    @Override
    public void exitSomevaluesAdd(GramatykaParser.SomevaluesAddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.FLOAT ){
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.FLOAT) );
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSomevaluesSub(GramatykaParser.SomevaluesSubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.sub_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.FLOAT ){
                LLVMGenerator.sub_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.FLOAT) );
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSomevaluesMul(GramatykaParser.SomevaluesMulContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.FLOAT ){
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.FLOAT) );
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitSomevaluesDiv(GramatykaParser.SomevaluesDivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.div_i32(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
            }
            if( v1.type == VarType.FLOAT ){
                LLVMGenerator.div_double(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.FLOAT) );
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }


    @Override
    public void exitValueFloat(GramatykaParser.ValueFloatContext ctx) {
        stack.push( new Value(ctx.FLOAT().getText(), VarType.FLOAT) );
    }

    @Override
    public void exitValueID(GramatykaParser.ValueIDContext ctx) {
        stack.push( new Value(ctx.ID().getText(), VarType.ID) );
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }


    @Override
    public void exitSomevalues2Default(GramatykaParser.Somevalues2DefaultContext ctx) {
        super.exitSomevalues2Default(ctx);
    }

    @Override
    public void exitValueInt(GramatykaParser.ValueIntContext ctx) {
        stack.push( new Value(ctx.INT().getText(), VarType.INT) );
    }

    @Override
    public void exitValueBrackets(GramatykaParser.ValueBracketsContext ctx) {
        super.exitValueBrackets(ctx);
    }
    public String set_variable(String ID, VarType type){
        String id;
        if( global ){
            if( ! globalnames.contains(ID) ) {
                globalnames.add(ID);
                if(type==VarType.INT) {
                    LLVMGenerator.declare_i32(ID, true);
                }
                if(type == VarType.FLOAT){
                    LLVMGenerator.declare_double(ID,true);
                }
            }
            id = "@"+ID;
        } else {
            if( ! localnames.contains(ID) ) {
                localnames.add(ID);
                if(type==VarType.INT) {
                    LLVMGenerator.declare_i32(ID, false);
                }
                if(type == VarType.FLOAT){
                    LLVMGenerator.declare_double(ID,false);
                }
            }
            id = "%"+ID;
        }
        return id;
    }


    void error(int line, String msg){
        System.err.println("Error, line "+line+", "+msg);
        System.exit(1);
    }
}
