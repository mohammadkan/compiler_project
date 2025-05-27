package AST;

import Antlr.BaseVisitor;

public class sy extends ASTNode {
    public String id;

    public sy() {
        super("sy");
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nsy{" +
                "\nid='" + id + '\'' +
                '}';
    }


}
