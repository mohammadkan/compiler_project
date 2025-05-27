package AST;

public class InjectableConfig extends ASTNode {
    private String providedIn;

    public InjectableConfig(String providedIn) {
        super("InjectableConfig");
        this.providedIn = providedIn;
    }

    public String getProvidedIn() {
        return providedIn;
    }

    public void setProvidedIn(String providedIn) {
        this.providedIn = providedIn;
    }

    @Override
    public String toString() {
        return "InjectableConfig{" +
                "providedIn='" + providedIn + '\'' +
                '}';
    }

}
