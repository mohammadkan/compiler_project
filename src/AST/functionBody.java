package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class functionBody extends ASTNode{
  public List<Variable> variables;
  public List<thisCall> thisCalls;
  public List<Print> prints;
  public List<callFun> callFuns;

    public functionBody() {
        super("functionBody");

    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void setVariables(List<Variable> variables) {
        this.variables = variables;
    }

    public List<thisCall> getThisCalls() {
        return thisCalls;
    }

    public void setThisCalls(List<thisCall> thisCalls) {
        this.thisCalls = thisCalls;
    }

    public List<Print> getPrints() {
        return prints;
    }

    public void setPrints(List<Print> prints) {
        this.prints = prints;
    }

    public List<callFun> getCallFuns() {
        return callFuns;
    }

    public void setCallFuns(List<callFun> callFuns) {
        this.callFuns = callFuns;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("function body : {");
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
            if (thisCalls != null && !thisCalls.isEmpty()) {
                stringBuilder.append(" thisCalls [");
                for (int i = 0; i < thisCalls.size(); i++) {
                    stringBuilder.append(thisCalls.get(i));
                    if (i < thisCalls.size() - 1) {
                        stringBuilder.append(",");
                    }
                }
            }
                stringBuilder.append("]");
                if (prints!= null && !prints.isEmpty()) {
                    stringBuilder.append(" print [");
                    for (int i = 0; i < prints.size(); i++) {
                        stringBuilder.append(prints.get(i));
                        if (i < prints.size() - 1) {
                            stringBuilder.append(",");
                        }
                    }
                    stringBuilder.append("]");
                }
                    if (callFuns != null && !callFuns.isEmpty()) {
                        stringBuilder.append(" call fun [");
                        for (int i = 0; i < callFuns.size(); i++) {
                            stringBuilder.append(callFuns.get(i));
                            if (i < callFuns.size() - 1) {
                                stringBuilder.append(",");
                            }
                        }
                        stringBuilder.append("]");
                    }


        stringBuilder.append("}");
        return stringBuilder.toString();

    }


}
