package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class mapMethod2 extends ASTNode {
    public List<String> ids;
    public mapParam mapParam;
    public html html;

    public mapMethod2() {
        super("map method 2");
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public AST.mapParam getMapParam() {
        return mapParam;
    }

    public void setMapParam(AST.mapParam mapParam) {
        this.mapParam = mapParam;
    }

    public AST.html getHtml() {
        return html;
    }

    public void setHtml(AST.html html) {
        this.html = html;
    }

    @Override
    public String toString() {
     StringBuilder stringBuilder = new StringBuilder("map Method 2 :{");
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
        stringBuilder.append("map param:").append(mapParam);
        stringBuilder.append("html :").append(html).append("}");
        return stringBuilder.toString();
    }


}
