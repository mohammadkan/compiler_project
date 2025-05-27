package AST;

import Antlr.BaseVisitor;

public class htmlVar extends ASTNode {
    public String Id;

    public htmlVar() {
        super("html var");
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "\nhtmlVar{" +
                "\nId='" + Id + '\'' +
                '}';
    }


}


