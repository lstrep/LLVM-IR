// Generated from C:/Users/£ukaszStrep/Desktop/PJATK/Project/src\Gramatyka.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramatykaParser}.
 */
public interface GramatykaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramatykaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramatykaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrite(GramatykaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrite(GramatykaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GramatykaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GramatykaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(GramatykaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(GramatykaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code call}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCall(GramatykaParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCall(GramatykaParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wrongStat}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWrongStat(GramatykaParser.WrongStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wrongStat}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWrongStat(GramatykaParser.WrongStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareArray(GramatykaParser.DeclareArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareArray(GramatykaParser.DeclareArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeArrayAt}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWriteArrayAt(GramatykaParser.WriteArrayAtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeArrayAt}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWriteArrayAt(GramatykaParser.WriteArrayAtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newString}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNewString(GramatykaParser.NewStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newString}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNewString(GramatykaParser.NewStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeString}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWriteString(GramatykaParser.WriteStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeString}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWriteString(GramatykaParser.WriteStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(GramatykaParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(GramatykaParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GramatykaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GramatykaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GramatykaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GramatykaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#fparam}.
	 * @param ctx the parse tree
	 */
	void enterFparam(GramatykaParser.FparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#fparam}.
	 * @param ctx the parse tree
	 */
	void exitFparam(GramatykaParser.FparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#blockfunction}.
	 * @param ctx the parse tree
	 */
	void enterBlockfunction(GramatykaParser.BlockfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#blockfunction}.
	 * @param ctx the parse tree
	 */
	void exitBlockfunction(GramatykaParser.BlockfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(GramatykaParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(GramatykaParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#insideIf}.
	 * @param ctx the parse tree
	 */
	void enterInsideIf(GramatykaParser.InsideIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#insideIf}.
	 * @param ctx the parse tree
	 */
	void exitInsideIf(GramatykaParser.InsideIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#ifStart}.
	 * @param ctx the parse tree
	 */
	void enterIfStart(GramatykaParser.IfStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#ifStart}.
	 * @param ctx the parse tree
	 */
	void exitIfStart(GramatykaParser.IfStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#ifEnd}.
	 * @param ctx the parse tree
	 */
	void enterIfEnd(GramatykaParser.IfEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#ifEnd}.
	 * @param ctx the parse tree
	 */
	void exitIfEnd(GramatykaParser.IfEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#blockfor}.
	 * @param ctx the parse tree
	 */
	void enterBlockfor(GramatykaParser.BlockforContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#blockfor}.
	 * @param ctx the parse tree
	 */
	void exitBlockfor(GramatykaParser.BlockforContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(GramatykaParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(GramatykaParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterEqualsIf(GramatykaParser.EqualsIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitEqualsIf(GramatykaParser.EqualsIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isBiggerIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterIsBiggerIf(GramatykaParser.IsBiggerIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isBiggerIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitIsBiggerIf(GramatykaParser.IsBiggerIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isSmallerIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterIsSmallerIf(GramatykaParser.IsSmallerIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isSmallerIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitIsSmallerIf(GramatykaParser.IsSmallerIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramatykaParser#wrongStatement}.
	 * @param ctx the parse tree
	 */
	void enterWrongStatement(GramatykaParser.WrongStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramatykaParser#wrongStatement}.
	 * @param ctx the parse tree
	 */
	void exitWrongStatement(GramatykaParser.WrongStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somevaluesDefault}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 */
	void enterSomevaluesDefault(GramatykaParser.SomevaluesDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somevaluesDefault}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 */
	void exitSomevaluesDefault(GramatykaParser.SomevaluesDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somevaluesAdd}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 */
	void enterSomevaluesAdd(GramatykaParser.SomevaluesAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somevaluesAdd}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 */
	void exitSomevaluesAdd(GramatykaParser.SomevaluesAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somevaluesSub}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 */
	void enterSomevaluesSub(GramatykaParser.SomevaluesSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somevaluesSub}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 */
	void exitSomevaluesSub(GramatykaParser.SomevaluesSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somevalues2Default}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 */
	void enterSomevalues2Default(GramatykaParser.Somevalues2DefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somevalues2Default}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 */
	void exitSomevalues2Default(GramatykaParser.Somevalues2DefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somevaluesMul}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 */
	void enterSomevaluesMul(GramatykaParser.SomevaluesMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somevaluesMul}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 */
	void exitSomevaluesMul(GramatykaParser.SomevaluesMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somevaluesDiv}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 */
	void enterSomevaluesDiv(GramatykaParser.SomevaluesDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somevaluesDiv}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 */
	void exitSomevaluesDiv(GramatykaParser.SomevaluesDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueInt(GramatykaParser.ValueIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueInt(GramatykaParser.ValueIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueFloat(GramatykaParser.ValueFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueFloat(GramatykaParser.ValueFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueID}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueID(GramatykaParser.ValueIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueID}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueID(GramatykaParser.ValueIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueBrackets}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValueBrackets(GramatykaParser.ValueBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueBrackets}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValueBrackets(GramatykaParser.ValueBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intArray}
	 * labeled alternative in {@link GramatykaParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterIntArray(GramatykaParser.IntArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intArray}
	 * labeled alternative in {@link GramatykaParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitIntArray(GramatykaParser.IntArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatArray}
	 * labeled alternative in {@link GramatykaParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterFloatArray(GramatykaParser.FloatArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatArray}
	 * labeled alternative in {@link GramatykaParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitFloatArray(GramatykaParser.FloatArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValueInt}
	 * labeled alternative in {@link GramatykaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayValueInt(GramatykaParser.ArrayValueIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValueInt}
	 * labeled alternative in {@link GramatykaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayValueInt(GramatykaParser.ArrayValueIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValueFloat}
	 * labeled alternative in {@link GramatykaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayValueFloat(GramatykaParser.ArrayValueFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValueFloat}
	 * labeled alternative in {@link GramatykaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayValueFloat(GramatykaParser.ArrayValueFloatContext ctx);
}