// Generated from C:/Users/DELL/Desktop/compiler_new/angularcompiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngParser}.
 */
public interface AngParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(AngParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(AngParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#importR}.
	 * @param ctx the parse tree
	 */
	void enterImportR(AngParser.ImportRContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#importR}.
	 * @param ctx the parse tree
	 */
	void exitImportR(AngParser.ImportRContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#exports}.
	 * @param ctx the parse tree
	 */
	void enterExports(AngParser.ExportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#exports}.
	 * @param ctx the parse tree
	 */
	void exitExports(AngParser.ExportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void enterDecorater(AngParser.DecoraterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void exitDecorater(AngParser.DecoraterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfig(AngParser.ComponentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfig(AngParser.ComponentConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#directiveConfig}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveConfig(AngParser.DirectiveConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#directiveConfig}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveConfig(AngParser.DirectiveConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#injectableConfig}.
	 * @param ctx the parse tree
	 */
	void enterInjectableConfig(AngParser.InjectableConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#injectableConfig}.
	 * @param ctx the parse tree
	 */
	void exitInjectableConfig(AngParser.InjectableConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl(AngParser.TemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl(AngParser.TemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrls(AngParser.StyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrls(AngParser.StyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(AngParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(AngParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AngParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AngParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void enterSubValue(AngParser.SubValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void exitSubValue(AngParser.SubValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AngParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AngParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(AngParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(AngParser.VariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#vv}.
	 * @param ctx the parse tree
	 */
	void enterVv(AngParser.VvContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#vv}.
	 * @param ctx the parse tree
	 */
	void exitVv(AngParser.VvContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AngParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AngParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#function2}.
	 * @param ctx the parse tree
	 */
	void enterFunction2(AngParser.Function2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#function2}.
	 * @param ctx the parse tree
	 */
	void exitFunction2(AngParser.Function2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#dd}.
	 * @param ctx the parse tree
	 */
	void enterDd(AngParser.DdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#dd}.
	 * @param ctx the parse tree
	 */
	void exitDd(AngParser.DdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParams(AngParser.FunctionParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParams(AngParser.FunctionParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#thisCall}.
	 * @param ctx the parse tree
	 */
	void enterThisCall(AngParser.ThisCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#thisCall}.
	 * @param ctx the parse tree
	 */
	void exitThisCall(AngParser.ThisCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#dotdot}.
	 * @param ctx the parse tree
	 */
	void enterDotdot(AngParser.DotdotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#dotdot}.
	 * @param ctx the parse tree
	 */
	void exitDotdot(AngParser.DotdotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AngParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AngParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#html_open}.
	 * @param ctx the parse tree
	 */
	void enterHtml_open(AngParser.Html_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#html_open}.
	 * @param ctx the parse tree
	 */
	void exitHtml_open(AngParser.Html_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#html_close}.
	 * @param ctx the parse tree
	 */
	void enterHtml_close(AngParser.Html_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#html_close}.
	 * @param ctx the parse tree
	 */
	void exitHtml_close(AngParser.Html_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#html_single_line}.
	 * @param ctx the parse tree
	 */
	void enterHtml_single_line(AngParser.Html_single_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#html_single_line}.
	 * @param ctx the parse tree
	 */
	void exitHtml_single_line(AngParser.Html_single_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void enterNgIf(AngParser.NgIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#ngIf}.
	 * @param ctx the parse tree
	 */
	void exitNgIf(AngParser.NgIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void enterNgFor(AngParser.NgForContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#ngFor}.
	 * @param ctx the parse tree
	 */
	void exitNgFor(AngParser.NgForContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#src}.
	 * @param ctx the parse tree
	 */
	void enterSrc(AngParser.SrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#src}.
	 * @param ctx the parse tree
	 */
	void exitSrc(AngParser.SrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlClass}.
	 * @param ctx the parse tree
	 */
	void enterHtmlClass(AngParser.HtmlClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlClass}.
	 * @param ctx the parse tree
	 */
	void exitHtmlClass(AngParser.HtmlClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#click}.
	 * @param ctx the parse tree
	 */
	void enterClick(AngParser.ClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#click}.
	 * @param ctx the parse tree
	 */
	void exitClick(AngParser.ClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlDot}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDot(AngParser.HtmlDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlDot}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDot(AngParser.HtmlDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlVar}.
	 * @param ctx the parse tree
	 */
	void enterHtmlVar(AngParser.HtmlVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlVar}.
	 * @param ctx the parse tree
	 */
	void exitHtmlVar(AngParser.HtmlVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlinside}.
	 * @param ctx the parse tree
	 */
	void enterHtmlinside(AngParser.HtmlinsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlinside}.
	 * @param ctx the parse tree
	 */
	void exitHtmlinside(AngParser.HtmlinsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlID}.
	 * @param ctx the parse tree
	 */
	void enterHtmlID(AngParser.HtmlIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlID}.
	 * @param ctx the parse tree
	 */
	void exitHtmlID(AngParser.HtmlIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#sy}.
	 * @param ctx the parse tree
	 */
	void enterSy(AngParser.SyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#sy}.
	 * @param ctx the parse tree
	 */
	void exitSy(AngParser.SyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void enterValue2(AngParser.Value2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void exitValue2(AngParser.Value2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(AngParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(AngParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(AngParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(AngParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBody(AngParser.HtmlBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBody(AngParser.HtmlBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#hh}.
	 * @param ctx the parse tree
	 */
	void enterHh(AngParser.HhContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#hh}.
	 * @param ctx the parse tree
	 */
	void exitHh(AngParser.HhContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#mapMethod2}.
	 * @param ctx the parse tree
	 */
	void enterMapMethod2(AngParser.MapMethod2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#mapMethod2}.
	 * @param ctx the parse tree
	 */
	void exitMapMethod2(AngParser.MapMethod2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#mapParam}.
	 * @param ctx the parse tree
	 */
	void enterMapParam(AngParser.MapParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#mapParam}.
	 * @param ctx the parse tree
	 */
	void exitMapParam(AngParser.MapParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 */
	void enterCallFun(AngParser.CallFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 */
	void exitCallFun(AngParser.CallFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#cssCode}.
	 * @param ctx the parse tree
	 */
	void enterCssCode(AngParser.CssCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#cssCode}.
	 * @param ctx the parse tree
	 */
	void exitCssCode(AngParser.CssCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void enterCssKey(AngParser.CssKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void exitCssKey(AngParser.CssKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void enterCssInner(AngParser.CssInnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void exitCssInner(AngParser.CssInnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(AngParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(AngParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#interfaceCode}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCode(AngParser.InterfaceCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#interfaceCode}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCode(AngParser.InterfaceCodeContext ctx);
}