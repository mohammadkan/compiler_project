package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class thisCall  extends ASTNode{

    private String id;
    private VariableValue variableValues;
    private List<dotdot> dotdots;

    public thisCall() {
        super("thisCall");
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VariableValue getVariableValues() {
        return variableValues;
    }

    public void setVariableValues(VariableValue variableValues) {
        this.variableValues = variableValues;
    }

    public List<dotdot> getDotdots() {
        return dotdots;
    }

    public void setDotdots(List<dotdot> dotdots) {
        this.dotdots = dotdots;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("this Call :{");
        stringBuilder.append("variable value").append(variableValues);
        if (dotdots != null && !dotdots.isEmpty()) {
            stringBuilder.append(" dot dots [");
            for (int i = 0; i < dotdots.size(); i++) {
                stringBuilder.append(dotdots.get(i));
                if (i < dotdots.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }




}

