package AST;

public class DirectiveConfig extends ASTNode {
    private Selector selector;

    public DirectiveConfig(Selector selector) {
        super("DirectiveConfig");
        this.selector = selector;
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    @Override
    public String toString() {
        return "DirectiveConfig{" +
                "selector=" + selector +
                '}';
    }
}
