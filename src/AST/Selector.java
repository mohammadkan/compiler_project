package AST;

public class Selector extends ASTNode{
    private String value;

    public Selector() {
        super("Style");

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Selector{" +
                "value='" + value + '\'' +
                '}';
    }
}
