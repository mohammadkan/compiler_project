package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class htmlInside extends ASTNode{
    public sy sy;
    public List<htmlId> htmlIds;
    public List<htmlClass> htmlClasses;

    public htmlInside() {
        super("html Imside");
    }

    public AST.sy getSy() {
        return sy;
    }

    public void setSy(AST.sy sy) {
        this.sy = sy;
    }

    public List<htmlId> getHtmlIds() {
        return htmlIds;
    }

    public void setHtmlIds(List<htmlId> htmlIds) {
        this.htmlIds = htmlIds;
    }

    public List<htmlClass> getHtmlClasses() {
        return htmlClasses;
    }

    public void setHtmlClasses(List<htmlClass> htmlClasses) {
        this.htmlClasses = htmlClasses;
    }

    @Override
    public String toString() {
   StringBuilder stringBuilder = new StringBuilder("html Inside :{");
   stringBuilder.append("sy :"+ sy);
        if (htmlIds != null && !htmlIds.isEmpty()) {
            stringBuilder.append("html ids [");
            for (int i = 0; i < htmlIds.size(); i++) {
                stringBuilder.append(htmlIds.get(i));
                if (i < htmlIds.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (htmlClasses != null && !htmlClasses.isEmpty()) {
            stringBuilder.append(" html class [");
            for (int i = 0; i < htmlClasses.size(); i++) {
                stringBuilder.append(htmlClasses.get(i));
                if (i < htmlClasses.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
