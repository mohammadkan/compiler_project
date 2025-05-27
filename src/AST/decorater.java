package AST;

public class decorater extends ASTNode {
    private String type; // "Component", "Directive", or "Injectable"
    private Object config;
    public decorater() {
        super("decorater");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "\ndecorator{" +
                "\n type=" + type +
                "\nconfig=" + config +
                "\n }";
    }
}
