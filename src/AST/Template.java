package AST;

public class Template extends  ASTNode {
    private String value;

    public Template() {
        super("Template");

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Template{" +
                "value='" + value + '\'' +
                '}';
    }
}
