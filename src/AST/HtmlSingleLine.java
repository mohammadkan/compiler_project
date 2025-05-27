package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlSingleLine extends ASTNode {
    private String jsxOpen;
    private String syntax;
    private List<htmlClass> htmlClasses = new ArrayList<>();
    private List<Src> srcAttributes = new ArrayList<>();
    private String jsxSlash;
    private String jsxClose;

    public HtmlSingleLine() {
        super("Html_Single_Line");
    }

    public String getJsxOpen() {
        return jsxOpen;
    }

    public void setJsxOpen(String jsxOpen) {
        this.jsxOpen = jsxOpen;
    }

    public String getSyntax() {
        return syntax;
    }

    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    public List<htmlClass> getHtmlClasses() {
        return htmlClasses;
    }

    public void setHtmlClasses(List<htmlClass> htmlClasses) {
        this.htmlClasses = htmlClasses;
    }

    public List<Src> getSrcAttributes() {
        return srcAttributes;
    }

    public void setSrcAttributes(List<Src> srcAttributes) {
        this.srcAttributes = srcAttributes;
    }

    public String getJsxSlash() {
        return jsxSlash;
    }

    public void setJsxSlash(String jsxSlash) {
        this.jsxSlash = jsxSlash;
    }

    public String getJsxClose() {
        return jsxClose;
    }

    public void setJsxClose(String jsxClose) {
        this.jsxClose = jsxClose;
    }

    // ✅ إضافة `HtmlClass`
    public void addHtmlClass(htmlClass htmlClass) {
        htmlClasses.add(htmlClass);
    }


    // ✅ طباعة تفاصيل المكون
    @Override
    public String toString() {
        return "HtmlSingleLine {\n" +
                "  jsxOpen='" + jsxOpen + "',\n" +
                "  syntax='" + syntax + "',\n" +
                "  htmlClasses=" + htmlClasses + ",\n" +
                "  srcAttributes=" + srcAttributes + ",\n" +
                "  jsxSlash='" + jsxSlash + "',\n" +
                "  jsxClose='" + jsxClose + "'\n" +
                "}";
    }
}
