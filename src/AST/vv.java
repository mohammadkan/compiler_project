package AST;

import Antlr.BaseVisitor;

public class vv extends ASTNode {
    public String id;

    public vv() {
        super("vv");
    }

    public String getString() {
        return id;
    }

    public void setString(String string) {
        this.id = string;
    }

    @Override
    public String toString() {
        return "\nvv{" +
                "\nid='" + id + '\'' +
                '}';
    }


}
