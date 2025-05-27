package AST;

import Antlr.BaseVisitor;

public class attributeValue extends ASTNode {
    public String string;
    public String id;
    public String number;

    public attributeValue() {
        super("attribute value");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nattributeValue{" +
                "\nstring='" + string + '\'' +
                "\n, id='" + id + '\'' +
                "\n, number=" + number +
                '}';
    }


}
