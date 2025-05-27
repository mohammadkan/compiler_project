package AST;

import java.util.List;
public class Array extends ASTNode {
    public List<SubValue> subValues;

    public Array() {
        super("array");
    }
    public List<SubValue> getSubValues() {
        return subValues;
    }
    public void setSubValues(List<SubValue> subValues) {
        this.subValues = subValues;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Array :{");
        if (subValues != null && !subValues.isEmpty()) {
            stringBuilder.append("subValue[");
            for (int i = 0; i < subValues.size(); i++) {
                stringBuilder.append(subValues.get(i));
                if (i < subValues.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
