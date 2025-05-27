package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class dotdot extends ASTNode {
    public String id;
    public List<String> strings;
    public List<vv> vvs;
    public List<function2>function2s;

    public dotdot() {
        super("dot dot");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<vv> getVvs() {
        return vvs;
    }

    public void setVvs(List<vv> vvs) {
        this.vvs = vvs;
    }
    public List<function2> getFunction2s() {
        return function2s;
    }

    public void setFunction2s(List<function2> function2s) {
        this.function2s = function2s;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dot Dot : {");
        stringBuilder.append("id : " + id);

        if (vvs != null && !vvs.isEmpty()) {
            stringBuilder.append(" vvs [");
            for (int i = 0; i < vvs.size(); i++) {
                stringBuilder.append(vvs.get(i));
                if (i < vvs.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (function2s != null && !function2s.isEmpty()) {
            stringBuilder.append(" function 2 [");
            for (int i = 0; i < function2s.size(); i++) {
                stringBuilder.append(function2s.get(i));
                if (i < function2s.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (strings != null && !strings.isEmpty()) {
            stringBuilder.append(" strings [");
            for (int i = 0; i < strings.size(); i++) {
                stringBuilder.append(strings.get(i));
                if (i < strings.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();

    }

}
