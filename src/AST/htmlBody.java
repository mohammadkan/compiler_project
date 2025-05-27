package AST;

import Antlr.BaseVisitor;

public class htmlBody extends ASTNode {
    public mapMethod2 mapMethod2;
    public hh hh;

    public htmlBody() {
        super("html body");
    }

    public AST.mapMethod2 getMapMethod2() {
        return mapMethod2;
    }

    public void setMapMethod2(AST.mapMethod2 mapMethod2) {
        this.mapMethod2 = mapMethod2;
    }

    public AST.hh getHh() {
        return hh;
    }

    public void setHh(AST.hh hh) {
        this.hh = hh;
    }

    @Override
    public String toString() {
        return "\nhtmlBody{" +
                "\nmapMethod2=" + mapMethod2 +
                "\n, hh=" + hh +
                '}';
    }


}
