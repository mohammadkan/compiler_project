package Antlr;

import AST.*;
import AST.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.transform.sax.SAXResult;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.teeing;
import static java.util.stream.Collectors.toList;
public class BaseVisitor extends AngParserBaseVisitor<ASTNode> {

    public BaseVisitor() {

    }

    SymbolTable symbolTable = new SymbolTable();
//    private Deque<String> scopeStack = new ArrayDeque<>();

//     private String {
//         return scopeStack.isEmpty() ? "global" :scopeStack.peek();
//     }
//    private String getEnclosingscope() {
//        Iterator<String> it = scopeStack.iterator();
//        it.next();
//        return it.hasNext() ? it.next() : "global";
//    }
    public SymbolTable getSymbolTable(){
        return  symbolTable;
    }

    @Override
    public ASTNode visitComponentConfig(AngParser.ComponentConfigContext ctx) {

        String componentscope = "Component: " ;
//        scopeStack.push(componentscope);
        Selector selector = (Selector) visit(ctx.selector());

        TemplateUrl templateUrl = ctx.templateUrl() != null ? (TemplateUrl) visit(ctx.templateUrl()) : null;
        Template template = ctx.template() != null ? (Template) visit(ctx.template()) : null;

        StyleUrls styleUrls = ctx.styleUrls() != null ? (StyleUrls) visit(ctx.styleUrls()) : null;

        ComponentConfig componentConfig = new ComponentConfig(selector, templateUrl, template, styleUrls);


        String value = "";
        if (templateUrl != null) value+= "templateUrl: " + templateUrl.getValue();
        if (template != null) value+= "template: " + template.getValue();
        if (styleUrls != null) value += "styleUrls: " + styleUrls.getValues();
        symbolTable.add(
                "Component",
                "ComponentConfig",
                value
//               componentscope
        );
//         scopeStack.pop();
        return componentConfig;
    }

    @Override
    public ASTNode visitDirectiveConfig(AngParser.DirectiveConfigContext ctx) {
        Selector selector = (Selector) visit(ctx.selector());

        String directivescope = "derective: ";
//        scopeStack.push(directivescope);
        symbolTable.add(
               "Directive",
                "DirectiveConfig",
                "Directive"
//                
        );
        DirectiveConfig directiveConfig = new DirectiveConfig(selector);
//        scopeStack.pop();
        return directiveConfig;

    }

    @Override
    public ASTNode visitInjectableConfig(AngParser.InjectableConfigContext ctx) {
        String providedIn;
        if (ctx.PROVIDED_IN_ROOT() != null) {
            providedIn = ctx.PROVIDED_IN_ROOT().getText();
        } else if (ctx.PROVIDED_IN_PLATFORM() != null) {
            providedIn = ctx.PROVIDED_IN_PLATFORM().getText();
        } else if (ctx.PROVIDED_IN_ANY() != null) {
            providedIn = ctx.PROVIDED_IN_ANY().getText();
        } else if (ctx.SingleLineString() != null) {
            String raw = ctx.SingleLineString().getText();
            providedIn = raw.substring(1, raw.length() - 1); // Remove surrounding quotes
        } else {
            providedIn = "unknown";
        }
        String scope = "injectable: " +providedIn;
//        scopeStack.push(scope);

        symbolTable.add(
                providedIn,
                "InjectableConfig",
                "providedIn"
//                
        );
//        scopeStack.pop();
        return new InjectableConfig(providedIn);
    }


    @Override
    public ASTNode visitTemplate(AngParser.TemplateContext ctx) {
        Template template = new Template();
        if (ctx != null && ctx.SingleLineString() != null) {
            String row = ctx.SingleLineString().getText();
            String Value = row.substring(1, row.length() - 1);
            template.setValue(Value);

            symbolTable.add(
                    "template",
                    "Template",
                    Value
//                    
            );
        }

        return template;
    }


    @Override
    public ASTNode visitStyleUrls(AngParser.StyleUrlsContext ctx) {
      StyleUrls styleUrls = new StyleUrls();
      Array array = (Array) visit(ctx.array());

      List<String> values = new ArrayList<>();
      for (SubValue subValue : array.getSubValues()){
          values.add(subValue.toString());
      }
      styleUrls.setValues(values);
      symbolTable.add(
              "Styleurls",
              "Styleurls",
              String.join(",",values)
//              
      );
      return styleUrls;
    }

    @Override
    public ASTNode visitTemplateUrl(AngParser.TemplateUrlContext ctx) {
       TemplateUrl templateUrl = new TemplateUrl();
       if (ctx != null && ctx.SingleLineString() != null) {
           String raw = ctx.SingleLineString().getText();
           String value = raw.substring(1, raw.length() - 1);
           templateUrl.setValue(value);

           symbolTable.add(
                   "templateUrl",
                   "templateUrl",
                          value
//                         
           );
       }
       return templateUrl;
    }

    @Override
    public ASTNode visitSelector(AngParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx != null &&ctx.SingleLineString() != null) {
            String raw = ctx.SingleLineString().getText();
            String value = raw.substring(1, raw.length() - 1);
            selector.setValue(value);
//            String currentscope = ;
            symbolTable.add(
                    "selector",
                    "selector",
                    value
//                   currentscope
            );
        }
        return selector;
    }

    //---------App----start Node
    @Override
    public App visitApp(AngParser.AppContext ctx) {
      App app = new App();
      Row row = new Row();

      List<ImportR>  importRS=  new ArrayList<>();
      List<function> functions = new ArrayList<>();
      List<Variable> variables = new ArrayList<>();
      List<enum_> enumS = new ArrayList<>();
      List<Exports> exports = new ArrayList<>();
      List<interfaceCode> interfaceCodes = new ArrayList<>();
     for (int i =0 ; i<ctx.importR().size();i++) {
         ImportR importR = visitImportR(ctx.importR().get(i));
         importRS.add(importR);
     }
     for (int i =0 ; i<ctx.enum_().size();i++) {
         enum_ enumEntry = visitEnum(ctx.enum_().get(i));
         enumS.add(enumEntry);
     }
     for (int i =0 ; i<ctx.function().size();i++) {
         functions.add(visitFunction(ctx.function().get(i)));
     }
     for (int i =0 ; i<ctx.variable().size();i++) {
         variables.add(visitVariable(ctx.variable().get(i)));

     }
     for (int i =0 ; i<ctx.exports().size();i++) {
         exports.add(visitExports(ctx.exports().get(i)));

     }
     for (int i =0 ; i<ctx.interfaceCode().size();i++) {
         interfaceCodes.add(visitInterfaceCode(ctx.interfaceCode().get(i)));
     }
      symbolTable.print();
      return app;
    }


    @Override
    public ImportR visitImportR(AngParser.ImportRContext ctx) {
     ImportR imp = new ImportR();
     imp.setFrom(ctx.FROM().getText());
     if (ctx.SIGNAL() != null) {
         imp.setSignal(ctx.SIGNAL().getText());
     }
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
                    List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
         imp.setIdentifiers(strings);
        }
        Row row = new Row();
        row.setType("Import");
        StringBuilder value = new StringBuilder("from: " + imp.getFrom());
        if (imp.getSignal() != null) {
            value.append(", signal: ").append(imp.getSignal());
        }
        if (imp.getIdentifiers() != null && !imp.getIdentifiers().isEmpty()) {
            value.append(", identifiers: ").append(imp.getIdentifiers());
        }
        String name = imp.identifiers.isEmpty() ? "<anonymous-import>" : imp.identifiers.get(0) ;
//        // String scope = ;

        symbolTable.add(
                name,
                "Import",
                value.toString());

        return imp;
    }

    //----------Here in Symbol Table-----------
    @Override
    public Exports visitExports(AngParser.ExportsContext ctx) {

        Exports exports = new Exports();
        String className = ctx.ID(0).getText();
        List<decorater> decoraters = new ArrayList<>();
        for (AngParser.DecoraterContext decoraterContext : ctx.decorater()) {
            if (decoraterContext != null) {
                decoraters.add((decorater) visit(decoraterContext));
            }
        }
        exports.setDecorators(decoraters);
//        symbolTable.enterScope();
        List<String> ids = new ArrayList<>();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            ids = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
                     exports.setIds(ids);
        }
        classBody classBody = null;
        if (ctx.classBody() != null) {
//            scopeStack.push(className);
            exports.setClassBody((classBody) visit(ctx.classBody()));
            exports.setClassBody(classBody);

//            scopeStack.pop();
        }

        StringBuilder value = new StringBuilder();
        if (!ids.isEmpty()) {
            value.append("class name: ").append(ids.get(0));
        }

        if (!decoraters.isEmpty()) {
            if (!value.isEmpty()) value.append(", ");
            value.append("decorators: ").append(decoraters);
        }

        if (classBody != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("classBody: present");
        }

        String name = ids.isEmpty() ? "UnnamedClass" : ids.get(0);
        symbolTable.add(name, "class", "class");
//        symbolTable.exitScope();
        return exports;
    }

    @Override
    public classBody visitClassBody(AngParser.ClassBodyContext ctx) {
        classBody body = new classBody();
symbolTable.enterScope();
        List<Variable> variables = new ArrayList<>();
        for (AngParser.VariableContext variableContext : ctx.variable()) {
            if (variableContext != null) {
                variables.add((Variable) visit(variableContext));
            }
        }
        body.setVariables(variables);

        List<function> functions = new ArrayList<>();
       for (int i =0; i <ctx.function().size();i++) {
           functions.add((function) visit(ctx.function().get(i)));

       }

        List<interfaceCode> interfaceCodes = new ArrayList<>();
      for (int i =0; i< ctx.interfaceCode().size();i++) {
          interfaceCodes.add((interfaceCode) visit(ctx.interfaceCode().get(i)));
      }

        List<constructor> constructors = new ArrayList<>();
        for (int i=0;i<ctx.constructor().size();i++) {
            constructors.add((constructor) visit(ctx.constructor().get(i)));
        }

        StringBuilder value = new StringBuilder();

        value.append("variables: ").append(variables.size()).append(", ");
        value.append("functions: ").append(functions.size()).append(", ");
        value.append("interfaces: ").append(interfaceCodes.size()).append(", ");
        value.append("constructors: ").append(constructors.size());

      // String scope = ;
      symbolTable.add(
              "classBody",
              "structure",
              value.toString()
//              scope
      );
    symbolTable.exitScope();
        return body;

        }
    @Override
    public decorater visitDecorater(AngParser.DecoraterContext ctx) {

        decorater decoratorNode = new decorater();

          String type = null;
        if (ctx.COMPONENT() != null) {
            type = "Component";
            decoratorNode.setType(type);
        } else if (ctx.DIRECTIVE() != null) {
            type = "Directive";
            decoratorNode.setType(type);
        } else if (ctx.INJECTABLE() != null) {
            type = "Injectable";
            decoratorNode.setType(type);
        }

         ASTNode config = null;
        if (ctx.componentConfig() != null) config = visit(ctx.componentConfig());
        else if (ctx.directiveConfig() != null) {
           config=visit(ctx.directiveConfig()) ;
        } else if (ctx.injectableConfig() != null) {
           config = visit(ctx.injectableConfig());
        }
        decoratorNode.setConfig(config);

        if (type != null) {
            // String scope = ;
            String value = config !=null ? config.toString() :" no config";

            symbolTable.add(
                    type.toLowerCase(),
                    "decorator",
                    value
            );
        }
        return decoratorNode;
    }

    @Override
    public Map visitMap(AngParser.MapContext ctx) {
     Map map = new Map();
     for (int i =0 ; i < ctx.children.size(); i+= 2) {
         String key = ctx.children.get(i).getText();
         if (i +1 < ctx.children.size()) {
             ASTNode value = visit(ctx.children.get(i + 1));
             map.addEntry(key, value);
         }else {
             throw new IllegalArgumentException("Invalid map structure: missing value for key" + key);

         }
     }
      // String scope = ;
     symbolTable.add(
             "map",
             "structure",
             map.toString()
     );

        return map;
    }

    @Override
    public Value visitValue(AngParser.ValueContext ctx) {
        Value value = new Value();
        String valueType = "";
        String valueContent = "";
        if (ctx.subValue() != null) {
           SubValue subValue =(SubValue) visit(ctx.subValue());
           value.setSubValue(subValue);
            valueType ="subValue";
            valueContent = subValue.toString();
        }
        if (ctx.html() != null) {
            html htmlVal = (html) visit(ctx.html());
            value.setHtml(htmlVal);
            valueType = "html";
            valueContent = htmlVal.toString();

        }
        if (ctx.array() !=  null) {
            Array arr = (Array) visit(ctx.array());
            value.setArray(arr);
            valueType = "array";
            valueContent = arr.toString();
        }
        // String scope = ;
        symbolTable.add(
                "value",
                valueType,
                valueContent
        );

        return value;

    }

    @Override
    public Array visitArray(AngParser.ArrayContext ctx) {
        Array array = new Array();
        List<SubValue> subValues = new ArrayList<>();

        for (AngParser.SubValueContext subValueContext :ctx.subValue()) {
            if (subValueContext != null) {
                subValues.add((SubValue) visit(subValueContext));
            }
        }
        array.setSubValues(subValues);


        StringBuilder value = new StringBuilder();
        value.append("subValues: [");
        for (int i = 0; i < subValues.size(); i++) {
            value.append(subValues.get(i).toString());
            if (i < subValues.size() - 1) {
                value.append(", ");
            }
        }
        value.append("]");

        symbolTable.add(
                "array",
                "array",
                value.toString()
                
        );

        return array;

    }

    @Override
    public SubValue visitSubValue(AngParser.SubValueContext ctx) {
        SubValue subValue = new SubValue();

        if (ctx.SingleLineString() != null) {
            subValue.setString(ctx.SingleLineString().getText());
        }
        if (ctx.ID() != null) {
            subValue.setId(ctx.ID().getText());
        }
        if (ctx.DECIMEL() != null) {
            try {
                subValue.setDecimal(Integer.parseInt(ctx.DECIMEL().getText()));
            }catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid decimal value: " + ctx.DECIMEL().getText(), e);
            }
        }

        List<cssCode> cssCodes = new ArrayList<>();
        for (AngParser.CssCodeContext cssCodeContext : ctx.cssCode()) {
            if (cssCodeContext != null) {
                cssCodes.add((cssCode) visit(cssCodeContext));
            }
        }
        subValue.setCssCode(cssCodes);


        // Build a string representation of the subValue
        StringBuilder value = new StringBuilder();
        if (subValue.getString() != null) {
            value.append("string: ").append(subValue.getString());
        }
        if (subValue.getId() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("id: ").append(subValue.getId());
        }
        if (subValue.getDecimal() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("decimal: ").append(subValue.getDecimal());
        }
        if (!cssCodes.isEmpty()) {
            if (value.length() > 0) value.append(", ");
            value.append("cssCode: ").append(cssCodes);
        }

       symbolTable.add(
               "subValue",
               "value",
               value.toString()
               
       );
        return subValue;

    }

    @Override
    public Variable visitVariable(AngParser.VariableContext ctx) {
      Variable variable = new Variable();
        String variableType = "any";

        if (ctx.getChildCount() > 1) {
            String secondChildText = ctx.getChild(1).getText();
            if (secondChildText.equals("public") || secondChildText.equals("private")) {
                variable.setModifier(secondChildText);
            }
        }
        if (ctx.getChildCount() > 0) {
            String firstChildText = ctx.getChild(0).getText();
            if (firstChildText.equals("let") || firstChildText.equals("var") || firstChildText.equals("const")) {
                variable.setVisibility(firstChildText);
            }
        }
        if (ctx.DATATYPE_() != null) {
            variableType = ctx.DATATYPE_().getText();
        }

        variable.setName(ctx.ID().getText());

        if (ctx.vv() != null) {
            variable.setVvs((vv) visit(ctx.vv()));
        }

        List<dd> dds = ctx.dd().stream()
                .filter(Objects::nonNull)
                .map(ddContext -> (dd) visit(ddContext))
                .collect(Collectors.toList());
        variable.setDds(dds);



        StringBuilder value = new StringBuilder();

        if (variable.getModifier() != null) {
            value.append(", modifier: ").append(variable.getModifier());
        }
        if (variable.getVisibility() != null) {
            value.append(", visibility: ").append(variable.getVisibility());
        }
        if (variable.getVvs() != null) {
            value.append(", vv: ").append(variable.getVvs().toString());
        }
        if (!dds.isEmpty()) {
            value.append(", dds: ").append(dds.toString());
        }
        String actualValue = ctx.variableValue().getText();
        value.append(actualValue);


       symbolTable.add(
               variable.getName(),
                variableType,
                actualValue
               
       );
        return variable;
      }
//-------------------------//
    @Override
    public VariableValue visitVariableValue(AngParser.VariableValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setString(ctx.SingleLineString().getText());
        value.setId(ctx.ID().getText());
        value.setDecimal(Integer.parseInt(ctx.DECIMEL().getText()));
        value.setArray((Array) visit(ctx.array()));
        value.setMap((Map) visit(ctx.map()));
        value.setThisCall((thisCall) visit(ctx.thisCall()));
        value.setFunction2((function2) visit(ctx.function2()));
        value.setCallFun((callFun) visit(ctx.callFun()));
        value.setFunction((function) visit(ctx.function()));
        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvContext : ctx.vv()) {
            if (vvContext != null) {
                vvs.add((vv) visit(vvContext));
            }
        }
        value.setVvs(vvs);



        StringBuilder valueStr = new StringBuilder();
        if (value.getString() != null) {
            valueStr.append("string: ").append(value.getString());
        }
        if (value.getId() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("id: ").append(value.getId());
        }
        if (value.getDecimal() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("decimal: ").append(value.getDecimal());
        }
        if (value.getArray() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("array: ").append(value.getArray().toString());
        }
        if (value.getMap() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("map: ").append(value.getMap().toString());
        }
        if (value.getThisCall() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("thisCall: ").append(value.getThisCall().toString());
        }
        if (value.getFunction2() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("function2: ").append(value.getFunction2().toString());
        }
        if (value.getCallFun() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("callFun: ").append(value.getCallFun().toString());
        }
        if (value.getFunction() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("function: ").append(value.getFunction().toString());
        }
        if (!vvs.isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("vvs: ").append(vvs);
        }
        String inferredType = inferVariableValueType(value);

        symbolTable.add(
                "variable value",
                inferredType,
                valueStr.toString()
                
                );
        return value;

    }
    private String inferVariableValueType(VariableValue value) {
        if (value.getString() != null) return "string";
        if (value.getDecimal() != null) return "number";
        if (value.getArray() != null) return "array";
        if (value.getMap() != null) return "map";
        if (value.getThisCall() != null || value.getCallFun() != null) return "call";
        if (value.getFunction() != null || value.getFunction2() != null) return "function";
        if (value.getId() != null) return "identifier";
        if (value.getVvs() != null && !value.getVvs().isEmpty()) return "nested";
        return "unknown";
    }

    @Override
    public constructor visitConstructor(AngParser.ConstructorContext ctx) {
      constructor constructor = new constructor();
//      symbolTable.enterScope();
        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvContext : ctx.vv()) {
            if (vvContext != null) {
                vvs.add((vv) visit(vvContext));
            }
        }
        constructor.setVvs(vvs);
        constructor.setFunctionBody((functionBody) visit(ctx.functionBody()));


        StringBuilder valueStr = new StringBuilder();
        if (!vvs.isEmpty()) {
            valueStr.append("vvs: ").append(vvs);
        }
        if (constructor.getFunctionBody() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("functionBody: ").append(constructor.getFunctionBody().toString());
        }
        symbolTable.add(
                "constructor",
                "void", // or "function" if you want to be generic
                valueStr.toString()
                
        );
//        symbolTable.exitScope();
        return constructor;
    }

    @Override
    public vv visitVv(AngParser.VvContext ctx) {
        vv vv = new vv();
        vv.setString(ctx.ID().getText());

        symbolTable.add("vv", "string", "string: " + vv.getString() );
        return vv;
    }

    @Override
    public function visitFunction(AngParser.FunctionContext ctx) {
       function fun = new function();
       symbolTable.enterScope();
       if (ctx.ID() != null) {
           fun.setName(ctx.ID().getText());
       }
        String functionscopeName = ctx.ID() != null ? ctx.ID().getText() : "anynomous function";
//       scopeStack.push(functionscopeName);
        List<functionParam> params = new ArrayList<>();
        for (AngParser.FunctionParamsContext paramsContext : ctx.functionParams()) {
            if (paramsContext != null) {
                params.add((functionParam) visit(paramsContext));
            }
        }
        fun.setFunctionParams(params);
      if (ctx.vv() != null) {
          fun.setVv((vv) visit(ctx.vv()));
      }
        List<dd> dds = new ArrayList<>();
        for (AngParser.DdContext ddContext : ctx.dd()) {
            if (ddContext != null) {
                dds.add((dd) visit(ddContext));
            }
        }
        fun.setDdList(dds);
        if (ctx.functionBody() != null) {
            fun.setFunctionBody((functionBody) visit(ctx.functionBody()));
        }
        if (ctx.returnStatement() != null) {
            fun.setReturnStatement((returnStatement) visit(ctx.returnStatement()));
        }


        StringBuilder valueStr = new StringBuilder();
        valueStr.append("name: ").append(fun.getName());
        if (!params.isEmpty()) {
            valueStr.append(", params: ").append(params);
        }
        if (fun.getVv() != null) {
            valueStr.append(", vv: ").append(fun.getVv());
        }
        if (!dds.isEmpty()) {
            valueStr.append(", dds: ").append(dds);
        }
        if (fun.getFunctionBody() != null) {
            valueStr.append(", functionBody: ").append(fun.getFunctionBody());
        }
        if (fun.getReturnStatement() != null) {
            valueStr.append(", returnStatement: ").append(fun.getReturnStatement());
        }
        if (fun.getReturnStatement() != null){
            symbolTable.add(
                fun.getName(),
                "function",
                 fun.getReturnStatement().toString()
        );}
        else  symbolTable.add(
                fun.getName(),
                "function",
              "void");
    symbolTable.exitScope();
//scopeStack.pop();
        return fun;
    }

    @Override
    public function2 visitFunction2(AngParser.Function2Context ctx) {
       function2 fun2 = new function2();

        String scopeName = "function2@" + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
//    scopeStack.push(scopeName);
       List<functionParam> params = new ArrayList<>();
        for (AngParser.FunctionParamsContext paramsContext : ctx.functionParams()) {
            if (paramsContext != null) {
                params.add((functionParam) visit(paramsContext));
            }
        }
        fun2.setFunctionParams(params);

      fun2.setVv((vv) visit(ctx.vv()));

        List<dd> dds = new ArrayList<>();
        for (AngParser.DdContext ddContext : ctx.dd()) {
            if (ddContext != null) {
                dds.add((dd) visit(ddContext));
            }
        }
        fun2.setDdList(dds);
        fun2.setFunctionBody((functionBody) visit(ctx.functionBody()));
        fun2.setReturnStatement((returnStatement) visit(ctx.returnStatement()));

        StringBuilder valueStr = new StringBuilder();
        valueStr.append("params: ").append(params);
        if (fun2.getVv() != null) {
            valueStr.append(", vv: ").append(fun2.getVv());
        }
        if (!dds.isEmpty()) {
            valueStr.append(", dds: ").append(dds);
        }
        if (fun2.getFunctionBody() != null) {
            valueStr.append(", functionBody: ").append(fun2.getFunctionBody());
        }
        if (fun2.getReturnStatement() != null) {
            valueStr.append(", returnStatement: ").append(fun2.getReturnStatement());
        }
        symbolTable.add(
                "function 2",
                "anonymous function",
                valueStr.toString()
               
        );
//scopeStack.pop();
        return fun2;

    }

    @Override
    public dd visitDd(AngParser.DdContext ctx) {
       dd dd = new dd();
       dd.setDataType(ctx.DATATYPE_().getText());
       symbolTable.add(
               "dd",
               dd.getDataType(),
              dd.getDataType()
               );
       return dd;
    }

    @Override
    public functionParam visitFunctionParams(AngParser.FunctionParamsContext ctx) {
        functionParam param = new functionParam();
//        String scopeName =  + ".params";
//         scopeStack.push(scopeName);
        param.setVv((vv) visit(ctx.vv()));
        if (ctx.ID() != null) {
            param.setId(ctx.ID().getText());
        }
        symbolTable.add(
                param.getVv().toString(),
                param.getType(),
                ""
        );
//scopeStack.pop();
        return param;

    }
    @Override
    public functionBody visitFunctionBody(AngParser.FunctionBodyContext ctx) {
        functionBody body = new functionBody();

        // Create a unique scope for the function body
        String functionBodyscopeName = "functionBody:" + ctx.getParent().getText(); // Use function context or a unique identifier
//      scopeStack.push(functionBodyscopeName);

        // Handle variables in function body
        List<Variable> variables = new ArrayList<>();
        for (AngParser.VariableContext variableContext : ctx.variable()) {
            if (variableContext != null) {
                variables.add((Variable) visit(variableContext));
            }
        }
        body.setVariables(variables);

        // Handle function calls
        List<callFun> callFuns = new ArrayList<>();
        for (AngParser.CallFunContext callFunContext : ctx.callFun()) {
            if (callFunContext != null) {
                callFuns.add((callFun) visit(callFunContext));
            }
        }
        body.setCallFuns(callFuns);

        // Handle print statements
        List<Print> prints = new ArrayList<>();
        for (AngParser.PrintContext printContext : ctx.print()) {
            if (printContext != null) {
                prints.add((Print) visit(printContext));
            }
        }
        body.setPrints(prints);

        // Handle this calls
        List<thisCall> thisCalls = new ArrayList<>();
        for (AngParser.ThisCallContext thisCallContext : ctx.thisCall()) {
            if (thisCallContext != null) {
                thisCalls.add((thisCall) visit(thisCallContext));
            }
        }
        body.setThisCalls(thisCalls);




        StringBuilder valueStr = new StringBuilder();
        if (!variables.isEmpty()) {
            valueStr.append("variables: ").append(variables);
        }
        if (!callFuns.isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("callFuns: ").append(callFuns);
        }
        if (!prints.isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("prints: ").append(prints);
        }
        if (!thisCalls.isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("thisCalls: ").append(thisCalls);
        }
        symbolTable.add(
                "function body",
                "Body",
                "function value"
                

        );

//scopeStack.pop();
        return body;
    }


    @Override
    public thisCall visitThisCall(AngParser.ThisCallContext ctx) {
        thisCall call= new thisCall();
        call.setId(ctx.ID().toString());

        if (ctx.variableValue() != null) {
            call.setVariableValues((VariableValue) visit(ctx.variableValue()));
        }

        List<dotdot> dots = new ArrayList<>();
        for (AngParser.DotdotContext dotdotContext : ctx.dotdot()) {
            if (dotdotContext != null) {
                dots.add((dotdot) visit(dotdotContext));
            }
        }
        call.setDotdots(dots);

        StringBuilder valueStr = new StringBuilder();

        // Add ID
        if (call.getId() != null) {
            valueStr.append("id: ").append(call.getId());
        }

        // Add variable values
        if (call.getVariableValues() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("variableValues: ").append(call.getVariableValues());
        }

        // Add dotdot elements
        if (!dots.isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("dotdots: ").append(dots);
        }
        symbolTable.add(
                "this Call",
                call.getType(),
                call.getId() + call.getVariableValues()
                

        );
        return call;
    }

    @Override
    public dotdot visitDotdot(AngParser.DotdotContext ctx) {
        dotdot dot = new dotdot();

        if (ctx.ID() != null) {
            dot.setId(ctx.ID().getText());
        }
        if (ctx.SingleLineString() != null && !ctx.SingleLineString().isEmpty()) {
            List<String> strings = ctx.SingleLineString().stream()
                    .map(ParseTree::getText).collect(toList());
            dot.setStrings(strings);
        }

        List<vv> vvs = new ArrayList<>();
        List<AngParser.VvContext> vvContexts = (List<AngParser.VvContext>) ctx.vv();
        for (AngParser.VvContext vvContext : vvContexts) {
            if (vvContext != null) {
                vvs.add((vv) visit(vvContext));
            }
        }
        dot.setVvs(vvs);

        List<function2> function2s = new ArrayList<>();
        List<AngParser.Function2Context> function2Contexts = (List<AngParser.Function2Context>) ctx.function2();
        for (AngParser.Function2Context function2Context : function2Contexts) {
            if (function2Context != null) {
                function2s.add((function2) visit(function2Context));
            }
        }
        dot.setFunction2s(function2s);

        StringBuilder valueStr = new StringBuilder();

        if (dot.getId() != null) {
            valueStr.append("id: ").append(dot.getId());
        }

        if (dot.getStrings() != null && !dot.getStrings().isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("strings: ").append(dot.getStrings());
        }

        if (!dot.getVvs().isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("vvs: ").append(dot.getVvs());
        }

        if (!dot.getFunction2s().isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("function2s: ").append(dot.getFunction2s());
        }
if (dot.getId() != null && !dot.getId().isEmpty()){
        symbolTable.add(
              "dot" + dot.getId(),
                "dot dot",
                valueStr.toString()
                
        );
}else
    symbolTable.add(
            "dot",
            "dot dot",
            valueStr.toString()
            
    );

        return dot;
    }

    @Override
    public Print visitPrint(AngParser.PrintContext ctx) {
        Print print = new Print();
        if (ctx.SingleLineString() != null) {
            print.setString(ctx.SingleLineString().getText());
        }
        if (ctx.thisCall() !=null) {
            print.setThisCall((thisCall) visit(ctx.thisCall()));
        }

        StringBuilder value = new StringBuilder();

        if (print.getString() != null) {
            value.append("string: ").append(print.getString());
        }

        if (print.getThisCall() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("thisCall: ").append(print.getThisCall());
        }

      symbolTable.add(
              print.getString(),
              "Print ",
              value.toString()
              
      );
        return print;
    }

    @Override
    public returnStatement visitReturnStatement(AngParser.ReturnStatementContext ctx) {
        returnStatement statement = new returnStatement();

       if (ctx.thisCall() != null){
           statement.setThisCall((thisCall) visit(ctx.thisCall()));
       }
       if (ctx.ID() != null) {
           statement.setId(ctx.ID().getText());
       }
       if (ctx.SingleLineString() != null) {
           statement.setString(ctx.SingleLineString().getText());
       }
       if (ctx.DECIMEL() != null) {
           statement.setDecimal(Integer.parseInt(ctx.DECIMEL().getText()));
       }
       if (ctx.array() != null) {
           statement.setArray((Array) visit(ctx.array()));
       }

        StringBuilder value = new StringBuilder();

        if (statement.getId() != null) {
            value.append("id: ").append(statement.getId());
        }
        if (statement.getString() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("string: ").append(statement.getString());
        }
        if (statement.getDecimal() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("decimal: ").append(statement.getDecimal());
        }
        if (statement.getArray() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("array: ").append(statement.getArray());
        }
        if (statement.getThisCall() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("thisCall: ").append(statement.getThisCall());
        }
        String name = statement.getId() != null ? statement.getId() :
                statement.getString() != null ? statement.getString() :
                        statement.getDecimal() != null ? statement.getDecimal().toString() :
                                statement.getThisCall() != null ? statement.getThisCall().getId() :
                                        "anonymousReturn";

        symbolTable.add(
                name,
                "return",
                value.toString()
                
        );

        return statement;
    }

    @Override
    public html visitHtml(AngParser.HtmlContext ctx) {
       html html = new html();
    List<html> htmls = new ArrayList<>();
        List<String> Ids = new ArrayList<>();


        html.setHtmlOpen(visitHtml_open(ctx.html_open()));
       html.setHtmlClose(visitHtml_close(ctx.html_close()));
       if(ctx.html_single_line() != null)
       {
           html.setHtmlSingleLine(visitHtml_single_line(ctx.html_single_line()));
       }
       if(ctx.html() != null){
           for (int i =0 ; i< ctx.html().size() ; i++){
               htmls.add(visitHtml(ctx.html(i)));
           }
           html.setHtmls(htmls);
       }
       if(ctx.ID() != null){

           for (int i =0 ; i< ctx.ID().size() ; i++){
               Ids.add(ctx.ID(i).getText());
           }
           html.setIds(Ids);
       }
       if(ctx.thisCall() != null){
           html.setThisCall(visitThisCall(ctx.thisCall()));
       }

//       html.setTagName(ctx.SYNTAX().toString());
//       html.setBody((htmlBody) visit(ctx.htmlBody()));
//       html.setDot((htmlDot) visit(ctx.htmlDot()));
//       html.setVar((htmlVar) visit(ctx.htmlVar()));
//        List<html> htmls = new ArrayList<>();
//        for (AngParser.HtmlContext htmlContext : ctx.html()) {
//            if (htmlContext != null) {
//                htmls.add((html) visit(htmlContext));
//            }
//        }
//        htmls.add(html);
//        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
//            List<String> strings = ctx.ID().stream()
//                    .map(ParseTree::getText).collect(toList());
//            html.setIds(strings);
//
//        }
//        html.setHtmlInside((htmlInside) visit(ctx.htmlinside()));
//
//        StringBuilder value = new StringBuilder();
//
//        if (html.getIds() != null && !html.getIds().isEmpty()) {
//            value.append("ids: ").append(html.getIds());
//        }
//
//        if (html.getTagName() != null) {
//            value.append(", tagName: ").append(html.getTagName());
//        }
//        if (html.getBody() != null) {
//            value.append(", body: ").append(html.getBody());
//        }
//        if (html.getHtmlInside() != null) {
//            value.append(", htmlInside: ").append(html.getHtmlInside());
//        }
//        String name = html.getTagName() != null ? html.getTagName() :
//                (html.getIds() != null && !html.getIds().isEmpty()) ? html.getIds().get(0) :
//                        "anonymousHtml";
//
        symbolTable.add(
                "html",
                "html ",
                htmls.toString()
        );

        return html;
    }

    @Override
    public HtmlOpen visitHtml_open(AngParser.Html_openContext ctx) {
         List<htmlClass> htmlClasses = new ArrayList<>();
         List<NgFor> ngForList = new ArrayList<>();
         List<NgIf> ngIfList = new ArrayList<>();
         List<Click> clickList = new ArrayList<>();

        HtmlOpen htmlOpen = new HtmlOpen();
    if(ctx.htmlClass() != null){
        for (AngParser.HtmlClassContext htmlClassCtx : ctx.htmlClass()) {
            htmlClasses.add(visitHtmlClass(htmlClassCtx));
        }
        htmlOpen.setHtmlClasses(htmlClasses);

    }
    if(ctx.ngFor() != null){
        for (AngParser.NgForContext ngForCtx : ctx.ngFor()) {
            ngForList.add(visitNgFor(ngForCtx));
        }
       htmlOpen.setNgForList(ngForList);
    }
    if(ctx.ngIf() != null){
        for (AngParser.NgIfContext ngIfCtx : ctx.ngIf()) {
            ngIfList.add(visitNgIf(ngIfCtx));
        }
        htmlOpen.setNgIfList(ngIfList);
    }
if(ctx.click() != null){
        for (AngParser.ClickContext clickCtx : ctx.click()) {
            clickList.add(visitClick(clickCtx));
        }
    htmlOpen.setClickList(clickList);
}

        symbolTable.add(
                "html_open",
                "html_open ",
                htmlOpen.toString()
        );

        return htmlOpen;
    }

    @Override
    public HtmlClose visitHtml_close(AngParser.Html_closeContext ctx) {
            HtmlClose htmlClose=new HtmlClose();
            htmlClose.setJsxClose(ctx.JSX_CLOSE().getText());
            htmlClose.setJsxOpen(ctx.JSX_OPEN().getText());
            htmlClose.setSyntax(ctx.SYNTAX().getText());
            htmlClose.setJsxSlash(ctx.JSX_SLASH().getText());

        symbolTable.add(
                "html_close",
                "html_close ",
                htmlClose.toString()
        );
        return htmlClose;
    }

    @Override
    public HtmlSingleLine visitHtml_single_line(AngParser.Html_single_lineContext ctx) {

        HtmlSingleLine htmlSingleLine=new HtmlSingleLine();
         List<htmlClass> htmlClasses = new ArrayList<>();
         List<Src> srcAttributes = new ArrayList<>();

        if(ctx.htmlClass() != null){
            for (int i = 0; i< ctx.htmlClass().size();i++){
                htmlClasses.add(visitHtmlClass(ctx.htmlClass(i)));
            }
            htmlSingleLine.setHtmlClasses(htmlClasses);
        }

        if(ctx.src() != null){
            for (int i = 0; i< ctx.src().size();i++){
                srcAttributes.add(visitSrc(ctx.src(i)));
            }
            htmlSingleLine.setSrcAttributes(srcAttributes);
        }

        htmlSingleLine.setJsxOpen(ctx.JSX_OPEN().getText());
        htmlSingleLine.setJsxClose(ctx.JSX_CLOSE().getText());
        htmlSingleLine.setJsxSlash(ctx.JSX_SLASH().getText());
        htmlSingleLine.setJsxSlash(ctx.JSX_SLASH().getText());
        htmlSingleLine.setSyntax(ctx.SYNTAX().getText());


        symbolTable.add(
                "html_single_line",
                "html_single_linee ",
                htmlSingleLine.toString()
        );


        return new HtmlSingleLine();
    }

    @Override
    public NgIf visitNgIf(AngParser.NgIfContext ctx) {
        NgIf ngIf = new NgIf();
        ngIf.setMulti(ctx.MULTI().getText());
        ngIf.setNgIf(ctx.NGIF().getText());
        ngIf.setEqual(ctx.EQUAL().getText());
        ngIf.setSingleLineString(ctx.SingleLineString().getText());
        symbolTable.add(
                "ngIf",
                "ngIf ",
                ngIf.toString()
        );

        return ngIf;
    }

    @Override
    public NgFor visitNgFor(AngParser.NgForContext ctx) {
        NgFor ngFor = new NgFor();
        ngFor.setMulti(ctx.MULTI().getText());
        ngFor.setNgFor(ctx.NGFOR().getText());
        ngFor.setEqual(ctx.EQUAL().getText());
        ngFor.setSingleLineString(ctx.SingleLineString().getText());
        symbolTable.add(
                "ngFor",
                "ngFor ",
                ngFor.toString()
        );
        return ngFor;
    }

    @Override
    public Src visitSrc(AngParser.SrcContext ctx) {
        Src src = new Src();
        src.setOpenSquare(ctx.OPEN_SQUARE().getText());
        src.setSrc(ctx.SRC().getText());
        src.setCloseSquare(ctx.CLOSE_SQUARE().getText());
        src.setEqual(ctx.EQUAL().getText());
        src.setSingleLineString(ctx.SingleLineString().getText());

        symbolTable.add(
                "src",
                "src ",
                src.toString()
        );
        return src;
    }

    @Override
    public Click visitClick(AngParser.ClickContext ctx) {
        Click click = new Click();
        click.setOpen_prack(ctx.OPEN_PAREN().getText());
        click.setClick(ctx.CLICKK().getText());
        click.setClose_prack(ctx.CLOSE_PAREN().getText());
        click.setEqual(ctx.EQUAL().getText());
        click.setText(ctx.SingleLineString().getText());

        symbolTable.add(
                "click",
                "click ",
                click.toString()
        );
        return click;
    }

    //    @Override
//    public htmlDot visitHtmlDot(AngParser.HtmlDotContext ctx) {
//
//        htmlDot dot = new htmlDot();
//        List<TerminalNode> ids = ctx.ID();
//        if (ids.size() == 2) {
//
//            String idLeft = ids.get(0).getText();
//            String idRight = ids.get(1).getText();
//            dot.setIdLeft(idLeft);
//            dot.setIdright(idRight);
//        } else if (ids.isEmpty()) {
//
//            dot.setIdLeft(null);
//            dot.setIdright(null);
//        } else {
//
//            throw new IllegalStateException("call fun must have either two IDs (idLeft and idRight) or none.");
//        }
//
//        StringBuilder value = new StringBuilder();
//
//        if (dot.getIdLeft() != null) {
//            value.append("idLeft: ").append(dot.getIdLeft());
//        }
//        if (dot.getIdright() != null) {
//            if (!value.isEmpty()) value.append(", ");
//            value.append("idRight: ").append(dot.getIdright());
//        }
//
//        if (value.isEmpty()) {
//            value.append("No IDs defined");
//        }
//        String name;
//        if (dot.getIdLeft() != null && dot.getIdright() != null) {
//            name = dot.getIdLeft() + "." + dot.getIdright();
//        } else {
//            name = "htmlDot_anon"; // fallback if no IDs
//        }
//       symbolTable.add(name,"html_dot",value.toString());
//
//        return dot;
//    }
//
//    @Override
//    public htmlVar visitHtmlVar(AngParser.HtmlVarContext ctx) {
//        htmlVar var = new htmlVar();
//        var.setId(ctx.ID().getText());
//
//
//        String value = (var.getId() != null) ? "id: " + var.getId() : "No ID defined";
//       symbolTable.add(ctx.ID().getText(),"html var",value.toString());
//        return var;
//    }
//
//    @Override
//    public htmlInside visitHtmlinside(AngParser.HtmlinsideContext ctx) {
//
//        htmlInside inside = new htmlInside();
//       if (ctx.sy() != null) {
//           inside.setSy((sy) visit(ctx.sy()));
//       }
//        List<htmlId> ids = new ArrayList<>();
//        for (AngParser.HtmlIDContext idContext : ctx.htmlID()) {
//            if (idContext != null) {
//                ids.add((htmlId) visit(idContext));
//            }
//        }
//        inside.setHtmlIds(ids);
//        List<htmlClass> classes = new ArrayList<>();
//        for (AngParser.HtmlClassContext classContext : ctx.htmlClass()) {
//            if (classContext != null) {
//                classes.add((htmlClass) visit(classContext));
//            }
//        }
//        inside.setHtmlClasses(classes);
//
//
//        StringBuilder value = new StringBuilder();
//        if (inside.getSy() != null) {
//            value.append("sy: ").append(inside.getSy());
//        }
//
//        if (!ids.isEmpty()) {
//            if (value.length() > 0) value.append(", ");
//            value.append("ids: ").append(ids);
//        }
//
//        if (!classes.isEmpty()) {
//            if (value.length() > 0) value.append(", ");
//            value.append("classes: ").append(classes);
//        }
//        String name = "htmlInside_" + (ids.isEmpty() ? "anon" : ids.get(0).getId());
//
//        symbolTable.add(name,"html_inside",value.toString());
//        return inside;
//    }
//
//    @Override
//    public htmlId visitHtmlID(AngParser.HtmlIDContext ctx) {
//
//        htmlId id= new htmlId();
//        if (ctx.MULTI() != null) {
//            id.setIsMulti(ctx.MULTI().getText());
//        }
//        id.setId(ctx.ID().getText());
//        id.setValue2((Value2) visit(ctx.value2()));
//
//
//        StringBuilder value = new StringBuilder();
//        value.append("id: ").append(id.getId());
//
//        if (id.getIsMulti() != null) {
//            value.append(", isMulti: ").append(id.getIsMulti());
//        }
//
//        if (id.getValue2() != null) {
//            value.append(", value2: ").append(id.getValue2());
//        }
//       symbolTable.add(ctx.ID().getText(),"html_id",
//               value.toString());
//        return id;
//    }
//
    @Override
    public htmlClass visitHtmlClass(AngParser.HtmlClassContext ctx) {
      htmlClass htmlClass = new htmlClass();
      htmlClass.setClassName(ctx.CLASS().getText());
      htmlClass.setValue2((Value2) visit(ctx.value2()));

        StringBuilder value = new StringBuilder();
        value.append("className: ").append(htmlClass.getClassName());

        if (htmlClass.getValue2() != null) {
            value.append(", value2: ").append(htmlClass.getValue2());
        }

     symbolTable.add(htmlClass.getClassName(),"html_class",value.toString());
        return htmlClass;
    }

    @Override
    public sy visitSy(AngParser.SyContext ctx) {
      sy sy =new sy();
      sy.setId(ctx.ID().getText());


        StringBuilder value = new StringBuilder();
        value.append("id: ").append(sy.getId());

       symbolTable.add(ctx.ID().getText(),"Sy",value.toString());

        return sy;
    }

    @Override
    public Value2 visitValue2(AngParser.Value2Context ctx) {
        Value2 value2 = new Value2();
        if (ctx.onClick() != null) {
            value2.setOnClick((OnClick) visit(ctx.onClick()));

        }
        if (ctx.attributeValue() != null) {
            value2.setAttributeValue((attributeValue) visit(ctx.attributeValue()));
        }
        List<TerminalNode> ids = ctx.ID();
        if (ids.size() == 2) {

            String idLeft = ids.get(0).getText();
            String idRight = ids.get(1).getText();
            value2.setIdLeft(idLeft);
            value2.setIdRight(idRight);
        } else if (ids.isEmpty()) {

            value2.setIdLeft(null);
            value2.setIdRight(null);
        } else {

            throw new IllegalStateException("call fun must have either two IDs (idLeft and idRight) or none.");
        }



        StringBuilder value = new StringBuilder();
        if (value2.getIdLeft() != null) {
            value.append("idLeft: ").append(value2.getIdLeft());
        }
        if (value2.getIdRight() != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("idRight: ").append(value2.getIdRight());
        }
        if (value2.getOnClick() != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("onClick: ").append(value2.getOnClick());
        }
        if (value2.getAttributeValue() != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("attributeValue: ").append(value2.getAttributeValue());
        }
        symbolTable.add(value2.getClass().getSimpleName(), "Value2", value.toString() );



        return value2;

    }

    @Override
    public OnClick visitOnClick(AngParser.OnClickContext ctx) {
          OnClick click = new OnClick();
          click.setFunction2((function2) visit(ctx.function2()));
          click.setId(ctx.ID().getText());

        StringBuilder value = new StringBuilder();
        if (click.getId() != null) {
            value.append("id: ").append(click.getId());
        }
        if (click.getFunction2() != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("function2: ").append(click.getFunction2());
        }
        symbolTable.add(click.getClass().getSimpleName(), "OnClick", value.toString() );

        return click;
    }

    @Override
    public attributeValue visitAttributeValue(AngParser.AttributeValueContext ctx) {
   attributeValue attributeValue = new attributeValue();
   if (ctx.SingleLineString() != null) {
       attributeValue.setString(ctx.SingleLineString().getText());
   }
   if (ctx.ID() != null) {
       attributeValue.setId(ctx.ID().getText());
   }
   if (ctx.NUMBER() != null) {
       attributeValue.setNumber(ctx.NUMBER().getText());
   }


        StringBuilder value = new StringBuilder();
        if (attributeValue.getString() != null) {
            value.append("string: ").append(attributeValue.getString());
        }
        if (attributeValue.getId() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("id: ").append(attributeValue.getId());
        }
        if (attributeValue.getNumber() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("number: ").append(attributeValue.getNumber());
        }

        symbolTable.add(attributeValue.getClass().getSimpleName(), "AttributeValue", value.toString() );

        return attributeValue;

    }

    @Override
    public hh visitHh(AngParser.HhContext ctx) {
       hh h = new hh();
       h.setId(ctx.ID().getText());
       h.setHtml((html) visit(ctx.html()));

        StringBuilder value = new StringBuilder();
        if (h.getId() != null) {
            value.append("id: ").append(h.getId());
        }
        if (h.getHtml() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("html: ").append(h.getHtml().toString());
        }
       symbolTable.add(ctx.ID().getText(),"HH ",value.toString());

        return h;
    }

    @Override
    public htmlBody visitHtmlBody(AngParser.HtmlBodyContext ctx) {
        htmlBody body = new htmlBody();
        body.setHh((hh) visit(ctx.hh()));
        body.setMapMethod2((mapMethod2) visit(ctx.mapMethod2()));


        StringBuilder value = new StringBuilder();
        if (body.getHh() != null) {
            value.append("hh: ").append(body.getHh().toString());
        }
        if (body.getMapMethod2() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("mapMethod2: ").append(body.getMapMethod2().toString());
        }
        symbolTable.add(body.getClass().getSimpleName(), "htmlBody", value.toString() );
        return body;

    }

    @Override
    public mapMethod2 visitMapMethod2(AngParser.MapMethod2Context ctx) {
       mapMethod2 map = new mapMethod2();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            map.setIds(strings);

        }
        map.setMapParam((mapParam) visit(ctx.mapParam()));
        map.setHtml((html) visit(ctx.html()));


        StringBuilder value = new StringBuilder();
        if (map.getIds() != null && !map.getIds().isEmpty()) {
            value.append("ids: ").append(String.join(", ", map.getIds()));
        }
        if (map.getMapParam() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("mapParam: ").append(map.getMapParam().toString());
        }
        if (map.getHtml() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("html: ").append(map.getHtml().toString());
        }

     symbolTable.add(map.getIds().get(0),"map method",value.toString());
        return map;

    }

    @Override
    public callFun visitCallFun(AngParser.CallFunContext ctx) {
        callFun callFun = new callFun();

        if (ctx.ID() != null) {
            callFun.setId(ctx.ID().toString());

        }
        List<TerminalNode> ids = ctx.ID();
        if (ids.size() == 2) {

            String idLeft = ids.get(0).getText();
            String idRight = ids.get(1).getText();
            callFun.setIdLeft(idLeft);
            callFun.setIdRight(idRight);
        } else if (ids.isEmpty()) {

            callFun.setIdLeft(null);
            callFun.setIdRight(null);
        } else {

            throw new IllegalStateException("call fun must have either two IDs (idLeft and idRight) or none.");
        }
        if (ctx.SingleLineString() != null && !ctx.SingleLineString().isEmpty()) {
            List<String> strings = ctx.SingleLineString().stream()
                    .map(ParseTree::getText).collect(toList());
            callFun.setStrings(strings);

        }

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> identifiers = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            callFun.setStrings(identifiers);
        }
        List<Map> maps = new ArrayList<>();
        for (AngParser.MapContext mapContext : ctx.map()) {
            if (mapContext != null) {
                maps.add((Map) visit(mapContext));
            }
        }
        callFun.setMaps(maps);

        List<callFun> callFuns = new ArrayList<>();
        for (AngParser.CallFunContext callFunContext : ctx.callFun()) {
            if (callFunContext != null) {
                callFuns.add((callFun) visit(callFunContext));
            }
        }
        callFun.setCallFuns(callFuns);
        String name = (ids != null && !ids.isEmpty()) ? ids.get(0).getText() : "anynomous";
        StringBuilder value = new StringBuilder();

        if (callFun.getIdLeft() != null) value.append("idLeft: ").append(callFun.getIdLeft());
        if (callFun.getIdRight() != null) value.append(", idRight: ").append(callFun.getIdRight());

        if (callFun.getStrings() != null && !callFun.getStrings().isEmpty()) {
            value.append(", strings: ").append(callFun.getStrings());
        }

        if (!maps.isEmpty()) value.append(", maps: ").append(maps.toString());
        if (!callFuns.isEmpty()) value.append(", callFuns: ").append(callFuns.toString());

        symbolTable.add(name, "callFun", value.toString() );

        return callFun;

    }

    @Override
    public mapParam visitMapParam(AngParser.MapParamContext ctx) {
      mapParam param = new mapParam();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            param.setIds(strings);
        }


        String value = "ids: " + String.join(", ", param.getIds());
       symbolTable.add(param.getIds().get(0),"map parameter",value.toString());
        return param;
    }

    @Override
    public cssCode visitCssCode(AngParser.CssCodeContext ctx) {
      cssCode code = new cssCode();

        List<cssKey> keys = new ArrayList<>();
        for (AngParser.CssKeyContext cssKeyContext : ctx.cssKey()) {
            if (cssKeyContext != null) {
                cssKey key = (cssKey) visit(cssKeyContext);
                keys.add(key);


                if (key.getSies() != null) {
                    for (sy sy :key.getSies()) {
                      symbolTable.add(
                              "csskay_sy",
                              "cssKey",
                              "sy:" + sy.toString()
                              
                      );
                    }
                }else{
                    symbolTable.add( "csskay_sy",
                            "cssKey",
                            "sy: Empty"
                            );
                }

            }
        }
        code.setCssKeys(keys);
        List<cssInner> inners = new ArrayList<>();
        for (AngParser.CssInnerContext innerContext : ctx.cssInner()) {
            if (innerContext != null) {
                cssInner inner = (cssInner) visit(innerContext);
                inners.add(inner);

                if (inner.getId() != null) {
                    String name = (inner.getId() != null) ? inner.getId() : "anonymous";
                    String value = "id: " + name;
                    symbolTable.add(
                            name,
                            "cssInner",
                            value
                            
                    );
                }

            }
        }
        code.setCssInners(inners);
        // Optional: Log cssCode itself if needed
        symbolTable.add(
                "cssCodeBlock",
                "cssCode",
                "cssKeys: " + keys.size() + ", cssInners: " + inners.size()
                
        );

        return code;
    }

    @Override
    public cssInner visitCssInner(AngParser.CssInnerContext ctx) {
        cssInner inner = new cssInner();
        inner.setCssKey((cssKey) visit(ctx.cssKey()));
        if (ctx.ID() != null) {
            inner.setId(ctx.ID().getText());
        }
        if (ctx.NUMBER() != null && !ctx.NUMBER().isEmpty()) {
            List<String> strings = ctx.NUMBER().stream()
                    .map(ParseTree::getText).map(String::valueOf).collect(Collectors.toList());
            inner.setNumbers(strings);
        }
        inner.setNumber(ctx.NUMBER().toString());
        inner.setCallFun((callFun) visit(ctx.callFun()));
        String idValue = inner.getId() != null ? inner.getId() : "anonymous";
        String numberStr = (inner.getNumber() != null) ? ", numbers: " + inner.getNumber() : "";
        String callFunStr = (inner.getCallFun() != null) ? ", callFun: yes" : "";

        symbolTable.add(idValue,"cssInner","id:" + idValue +numberStr +callFunStr);
       return inner;

    }

    @Override
    public cssKey visitCssKey(AngParser.CssKeyContext ctx) {
        cssKey key = new cssKey();
        List<sy> sies = new ArrayList<>();
        for (AngParser.SyContext syContext : ctx.sy()) {
            if (syContext != null) {
                sies.add((sy) visit(syContext));
            }
        }
        key.setSies(sies);

        StringBuilder syValues = new StringBuilder();
        for (sy s : sies) {
            if (syValues.length() > 0) syValues.append(", ");
            syValues.append(s.toString());
        }
        symbolTable.add(
                "cssKey",
                "cssKey",
                "sy values :" +syValues.toString()
                
        );

        return key;
    }

    @Override
    public enum_ visitEnum(AngParser.EnumContext ctx) {
        enum_ e = new enum_();
        sy enumName = (sy) visit(ctx.sy());
        e.setName(enumName);
        String enumscope = (enumName != null) ? enumName.toString() : "anonymous_enum";

//        scopeStack.push(enumscope);
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            e.setIds(strings);

            for (String id :strings) {
                symbolTable.add(id,"enum value","enum value of" );
            }
        }

        symbolTable.add(enumscope, "enum", "Enum with values: " + String.join(", ", e.getIds()));

        return e;
    }

    @Override
    public interfaceCode visitInterfaceCode(AngParser.InterfaceCodeContext ctx) {
       interfaceCode interfaceCode = new interfaceCode();
         sy name = (sy) visit(ctx.sy());
         symbolTable.enterScope();
       interfaceCode.setName(name);

        String interfacescope = name != null ? name.toString() : "anonymous_interface";

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            interfaceCode.setIds(strings);
            for (String id : strings) {
                symbolTable.add(id, "interface_id", "Part of interface " + interfacescope );
            }
        }
        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvContext : ctx.vv()) {
            if (vvContext != null) {
                vv member = (vv) visit(vvContext);
                symbolTable.add(member.getString(), "interface_member", member.toString() );

            }
        }
        interfaceCode.setMembers(vvs);
        symbolTable.add(interfacescope,"interface","Interface definition");
        symbolTable.exitScope();
        return interfaceCode;
    }
//this for print AST


    private int level = 0;


//    @Override
//    public ASTNode visit(ParseTree tree) {
//        if (tree == null) return null;
//
//        String indent = " ".repeat(level);
//        if (tree.getClass().getSimpleName().equals("TerminalNodeImpl")) {
//             String text = tree.getText();
//            System.out.println(indent + text);
//
//
//            return null;
//        }
//
//        System.out.println(indent + tree.getClass().getSimpleName() + ": ");
//       if (tree.getChildCount() == 0) {
//           System.out.println(tree.getText());
//       }else {
//           System.out.println("{");
//           level++;
//           for (int i = 0; i < tree.getChildCount(); i++) {
//               visit(tree.getChild(i));
//           }
//           level--;
//           System.out.println(indent + "}");
//
//       }
//        return null;
//    }
    private boolean isIdentifier(String text) {
        return text.matches("[a-zA-Z_][a-zA-Z0-9_]*");  // Example: check for valid variable names
    }

}