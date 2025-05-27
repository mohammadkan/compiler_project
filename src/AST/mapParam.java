package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class mapParam extends ASTNode {
    public List<String> ids;

    public mapParam() {
        super("map parameter");
    }

    public List<String> getIds() {

        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("map param : {");
        if (ids != null && !ids.isEmpty()) {
            stringBuilder.append(" ids [");
            for (int i = 0; i < ids.size(); i++) {
                stringBuilder.append(ids.get(i));
                if (i < ids.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
