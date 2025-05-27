package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class classBody extends ASTNode{

    public List<Variable> variables;
    public List<function> functions;
    public List<interfaceCode> interfaceCodes;
    public List<constructor> constructors;

    public classBody() {
        super("class body");
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public List<function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<function> functions) {
        this.functions = functions;
    }

    public List<interfaceCode> getInterfaceCodes() {
        return interfaceCodes;
    }

    public void setInterfaceCodes(List<interfaceCode> interfaceCodes) {
        this.interfaceCodes = interfaceCodes;
    }

    public List<constructor> getConstructors() {
        return constructors;
    }

    public void setConstructors(List<constructor> constructors) {
        this.constructors = constructors;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("class Body :{");

        if (interfaceCodes != null && !interfaceCodes.isEmpty()) {
            stringBuilder.append("interface codes [");
            for (int i = 0; i < interfaceCodes.size(); i++) {
                stringBuilder.append(interfaceCodes.get(i));
                if (i < interfaceCodes.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (functions != null && !functions.isEmpty()) {
            stringBuilder.append("function [");
            for (int i = 0; i < functions.size(); i++) {
                stringBuilder.append(functions.get(i));
                if (i < functions.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (variables != null && !variables.isEmpty()) {
            stringBuilder.append(" variables [");
            for (int i = 0; i < variables.size(); i++) {
                stringBuilder.append(variables.get(i));
                if (i < variables.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (constructors != null && !constructors.isEmpty()) {
            stringBuilder.append("constructor [");
            for (int i = 0; i < constructors.size(); i++) {
                stringBuilder.append(constructors.get(i));
                if (i < constructors.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
