// Generated from C:/Users/£ukaszStrep/Desktop/PJATK/Project/src\Gramatyka.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramatykaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramatykaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GramatykaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(GramatykaParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GramatykaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(GramatykaParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code call}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GramatykaParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wrongStat}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongStat(GramatykaParser.WrongStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareArray}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareArray(GramatykaParser.DeclareArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeArrayAt}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteArrayAt(GramatykaParser.WriteArrayAtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newString}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewString(GramatykaParser.NewStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeString}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteString(GramatykaParser.WriteStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GramatykaParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link GramatykaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(GramatykaParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GramatykaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#fparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFparam(GramatykaParser.FparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#blockfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockfunction(GramatykaParser.BlockfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#repetitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetitions(GramatykaParser.RepetitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#insideIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsideIf(GramatykaParser.InsideIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#ifStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStart(GramatykaParser.IfStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#ifEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfEnd(GramatykaParser.IfEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#blockfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockfor(GramatykaParser.BlockforContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#blockif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockif(GramatykaParser.BlockifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsIf(GramatykaParser.EqualsIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isBiggerIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsBiggerIf(GramatykaParser.IsBiggerIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isSmallerIf}
	 * labeled alternative in {@link GramatykaParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsSmallerIf(GramatykaParser.IsSmallerIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramatykaParser#wrongStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrongStatement(GramatykaParser.WrongStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somevaluesDefault}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomevaluesDefault(GramatykaParser.SomevaluesDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somevaluesAdd}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomevaluesAdd(GramatykaParser.SomevaluesAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somevaluesSub}
	 * labeled alternative in {@link GramatykaParser#someValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomevaluesSub(GramatykaParser.SomevaluesSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somevalues2Default}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomevalues2Default(GramatykaParser.Somevalues2DefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somevaluesMul}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomevaluesMul(GramatykaParser.SomevaluesMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somevaluesDiv}
	 * labeled alternative in {@link GramatykaParser#someValues2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomevaluesDiv(GramatykaParser.SomevaluesDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueInt}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueInt(GramatykaParser.ValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueFloat}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueFloat(GramatykaParser.ValueFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueID}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueID(GramatykaParser.ValueIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueBrackets}
	 * labeled alternative in {@link GramatykaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueBrackets(GramatykaParser.ValueBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intArray}
	 * labeled alternative in {@link GramatykaParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArray(GramatykaParser.IntArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatArray}
	 * labeled alternative in {@link GramatykaParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatArray(GramatykaParser.FloatArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValueInt}
	 * labeled alternative in {@link GramatykaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueInt(GramatykaParser.ArrayValueIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValueFloat}
	 * labeled alternative in {@link GramatykaParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValueFloat(GramatykaParser.ArrayValueFloatContext ctx);
}