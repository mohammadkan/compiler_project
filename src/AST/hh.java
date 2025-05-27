package AST;

import Antlr.BaseVisitor;

public class hh extends ASTNode {
    public String id;
    public html html;

    public hh() {
        super("hh");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AST.html getHtml() {
        return html;
    }

    public void setHtml(AST.html html) {
        this.html = html;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("hh : {");
       stringBuilder.append("id" + id);
       stringBuilder.append("html :" + html).append("}");
       return stringBuilder.toString();
    }


}
