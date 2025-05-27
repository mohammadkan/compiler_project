// Generated from C:/Users/DELL/Desktop/compiler_new/angularcompiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(AngParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#importR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportR(AngParser.ImportRContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#exports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExports(AngParser.ExportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorater(AngParser.DecoraterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfig(AngParser.ComponentConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#directiveConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveConfig(AngParser.DirectiveConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#injectableConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableConfig(AngParser.InjectableConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#templateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrl(AngParser.TemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#styleUrls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrls(AngParser.StyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(AngParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(AngParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubValue(AngParser.SubValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AngParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue(AngParser.VariableValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#vv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVv(AngParser.VvContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AngParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#function2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction2(AngParser.Function2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#dd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDd(AngParser.DdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParams(AngParser.FunctionParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#thisCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisCall(AngParser.ThisCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#dotdot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotdot(AngParser.DotdotContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AngParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#html_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_open(AngParser.Html_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#html_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_close(AngParser.Html_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#html_single_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_single_line(AngParser.Html_single_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#ngIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIf(AngParser.NgIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#ngFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgFor(AngParser.NgForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrc(AngParser.SrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClass(AngParser.HtmlClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick(AngParser.ClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDot(AngParser.HtmlDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlVar(AngParser.HtmlVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlinside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlinside(AngParser.HtmlinsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlID(AngParser.HtmlIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#sy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSy(AngParser.SyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue2(AngParser.Value2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(AngParser.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(AngParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBody(AngParser.HtmlBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#hh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHh(AngParser.HhContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#mapMethod2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapMethod2(AngParser.MapMethod2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#mapParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapParam(AngParser.MapParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFun(AngParser.CallFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#cssCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCode(AngParser.CssCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#cssKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKey(AngParser.CssKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssInner(AngParser.CssInnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(AngParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#interfaceCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCode(AngParser.InterfaceCodeContext ctx);
}