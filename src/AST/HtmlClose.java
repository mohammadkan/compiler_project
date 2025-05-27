package AST;

public class HtmlClose extends ASTNode{
    private String jsxOpen;
    private String jsxSlash;
    private String syntax;
    private String jsxClose;

    public HtmlClose() {
        super("Html_Close");
    }

    public String getJsxOpen() {
        return jsxOpen;
    }

    public void setJsxOpen(String jsxOpen) {
        this.jsxOpen = jsxOpen;
    }

    public String getJsxSlash() {
        return jsxSlash;
    }

    public void setJsxSlash(String jsxSlash) {
        this.jsxSlash = jsxSlash;
    }

    public String getSyntax() {
        return syntax;
    }

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    public String getJsxClose() {
        return jsxClose;
    }

    public void setJsxClose(String jsxClose) {
        this.jsxClose = jsxClose;
    }

    @Override
    public String toString() {
        return "HtmlClose { " +
                "jsxOpen='" + jsxOpen + '\'' +
                ", jsxSlash='" + jsxSlash + '\'' +
                ", syntax='" + syntax + '\'' +
                ", jsxClose='" + jsxClose + '\'' +
                " }";
    }
}
