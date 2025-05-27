package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class cssKey extends ASTNode{
    public List<sy> sies;

    public cssKey() {
        super("css key");
    }

    public List<sy> getSies() {
        return sies;
    }

    public void setSies(List<sy> sies) {
        this.sies = sies;
    }

    @Override
    public String toString() {
     StringBuilder stringBuilder = new StringBuilder("css key: {");
        if (sies != null && !sies.isEmpty()) {
            stringBuilder.append("sies [");
            for (int i = 0; i < sies.size(); i++) {
                stringBuilder.append(sies.get(i));
                if (i < sies.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
