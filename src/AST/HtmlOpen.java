package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlOpen extends ASTNode{
    private String jsxOpen;
    private String syntax;
    private String jsxClose;

    // قوائم خاصة لكل قاعدة بارسر
    private List<htmlClass> htmlClasses = new ArrayList<>();
    private List<NgFor> ngForList = new ArrayList<>();
    private List<NgIf> ngIfList = new ArrayList<>();
    private List<Click> clickList = new ArrayList<>();

    public HtmlOpen() {
        super("Html_Open");
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

    public String getJsxClose() {
        return jsxClose;
    }

    public void setJsxClose(String jsxClose) {
        this.jsxClose = jsxClose;
    }

    public List<htmlClass> getHtmlClasses() {
        return htmlClasses;
    }

    public void setHtmlClasses(List<htmlClass> htmlClasses) {
        this.htmlClasses = htmlClasses;
    }

    public List<NgFor> getNgForList() {
        return ngForList;
    }

    public void setNgForList(List<NgFor> ngForList) {
        this.ngForList = ngForList;
    }

    public List<NgIf> getNgIfList() {
        return ngIfList;
    }

    public void setNgIfList(List<NgIf> ngIfList) {
        this.ngIfList = ngIfList;
    }

    public List<Click> getClickList() {
        return clickList;
    }

    public void setClickList(List<Click> clickList) {
        this.clickList = clickList;
    }

    // ✅ إضافة عناصر إلى القوائم
    public void addHtmlClass(htmlClass htmlClass) {
        htmlClasses.add(htmlClass);
    }

    public void addNgFor(NgFor ngFor) {
        ngForList.add(ngFor);
    }

    public void addNgIf(NgIf ngIf) {
        ngIfList.add(ngIf);
    }

    public void addClick(Click click) {
        clickList.add(click);
    }

    // ✅ طباعة تفاصيل المكون
    @Override
    public String toString() {
        return "HtmlOpen {\n" +
                "  jsxOpen='" + jsxOpen + "',\n" +
                "  syntax='" + syntax + "',\n" +
                "  htmlClasses=" + htmlClasses + ",\n" +
                "  ngForList=" + ngForList + ",\n" +
                "  ngIfList=" + ngIfList + ",\n" +
                "  clickList=" + clickList + ",\n" +
                "  jsxClose='" + jsxClose + "'\n" +
                "}";
    }
}
