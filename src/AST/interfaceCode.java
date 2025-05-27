package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class interfaceCode extends ASTNode{
  public sy name;
  public List<String> ids;
  public List<vv> members;

    public interfaceCode() {
        super("interface");
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

    public List<vv> getMembers() {
        return members;
    }

    public void setMembers(List<vv> members) {
        this.members = members;
    }

    @Override
    public String toString() {
    StringBuilder stringBuilder = new StringBuilder("interface code : {");
    stringBuilder.append("name: ").append(name);
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
        if (members != null && !members.isEmpty()) {
            stringBuilder.append(" members [");
            for (int i = 0; i < members.size(); i++) {
                stringBuilder.append(members.get(i));
                if (i < members.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }



}
