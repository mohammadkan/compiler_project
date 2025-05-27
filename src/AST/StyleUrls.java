package AST;

import java.util.List;

public class StyleUrls extends ASTNode{
    private List<String> values; // The list of URLs for stylesheets

    public StyleUrls() {
        super("StyleUrls");

    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "StyleUrls{" +
                "values=" + values +
                '}';
    }
}
