package AST;

import Antlr.BaseVisitor;

public class htmlDot extends ASTNode {
    public String IdLeft;
    public String Idright;

    public htmlDot() {
        super("html dot");
    }

    public String getIdLeft() {
        return IdLeft;
    }

    public void setIdLeft(String idLeft) {
        IdLeft = idLeft;
    }

    public String getIdright() {
        return Idright;
    }

    public void setIdright(String idright) {
        Idright = idright;
    }

    @Override
    public String toString() {
        return "\nhtmlDot{" +
                "\nIdLeft='" + IdLeft + '\'' +
                "\n, Idright='" + Idright + '\'' +
                '}';
    }


}
