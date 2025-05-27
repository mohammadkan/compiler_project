package AST;

import Antlr.BaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class App extends ASTNode{
    public List<ImportR> importRS;
    public List<Exports> exports;
    public List<function> functions;
    public List<Variable> variables;
    public List<enum_> enumS;
    public List<interfaceCode> interfaceCodes;



    public App() {
        super("App");
    }

    public List<ImportR> getImportRS() {
        return importRS;
    }

    public void setImportRS(List<ImportR> importRS) {
        this.importRS = importRS;
    }

    public List<Exports> getExports() {
        return exports;
    }

    public void setExports(List<Exports> exports) {
        this.exports = exports;
    }

    public List<function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<function> functions) {
        this.functions = functions;
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public List<enum_> getEnumS() {
        return enumS;
    }

    public void setEnumS(List<enum_> enumS) {
        this.enumS = enumS;
    }

    public List<interfaceCode> getInterfaceCodes() {
        return interfaceCodes;
    }

    public void setInterfaceCodes(List<interfaceCode> interfaceCodes) {
        this.interfaceCodes = interfaceCodes;
    }

    @Override
    public String toString() {
     StringBuilder stringBuilder = new StringBuilder("App :{");
     if (importRS !=null && !importRS.isEmpty()) {
         stringBuilder.append("imports :[");
         for (int i =0; i <importRS.size();i++) {
             stringBuilder.append(importRS.get(i));
             if (i < importRS.size()-1) {
                 stringBuilder.append(",");
             }
         }
         stringBuilder.append("]");

     }
        if (exports!=null && !exports.isEmpty()) {
            stringBuilder.append("exports :[");
            for (int i =0; i <exports.size();i++) {
                stringBuilder.append(exports.get(i));
                if (i < exports.size()-1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        if (functions !=null && !functions.isEmpty()) {
            stringBuilder.append("functions :[");
            for (int i =0; i <functions.size();i++) {
                stringBuilder.append(functions.get(i));
                if (i < functions.size()-1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        if (variables !=null && !variables.isEmpty()) {
            stringBuilder.append("variables :[");
            for (int i =0; i <variables.size();i++) {
                stringBuilder.append(variables.get(i));
                if (i < variables.size()-1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        if (enumS !=null && !enumS.isEmpty()) {
            stringBuilder.append("enumS :[");
            for (int i =0; i <enumS.size();i++) {
                stringBuilder.append(enumS.get(i));
                if (i < enumS.size()-1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        if (interfaceCodes !=null && !interfaceCodes.isEmpty()) {
            stringBuilder.append("interfaceCodes :[");
            for (int i =0; i <interfaceCodes.size();i++) {
                stringBuilder.append(interfaceCodes.get(i));
                if (i < interfaceCodes.size()-1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        stringBuilder.append("}");
     return stringBuilder.toString();
    }


}
