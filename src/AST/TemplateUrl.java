package AST;

public class TemplateUrl extends ASTNode {
    private String value;

    public TemplateUrl() {
        super("TemplateUrl");

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TemplateUrl{" +
                "value='" + value + '\'' +
                '}';
    }

}
