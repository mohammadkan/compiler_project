package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class enum_ extends ASTNode{
    public sy name;
    public List<String> ids;

    public enum_() {
        super("enum");
    }


    public sy getName() {
        return name;
    }

    public void setName(sy name) {
        this.name = name;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("enum : {");
        stringBuilder.append("name").append(name);
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
