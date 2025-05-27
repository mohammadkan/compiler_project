package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class html extends ASTNode{
    private List<html> htmls;
    private HtmlOpen htmlOpen;
    private HtmlClose htmlClose;
    private NgFor ngFor;
    private  NgIf ngIf;
    private HtmlSingleLine htmlSingleLine;
    private List<String> Ids;
    private thisCall thisCall;

    public thisCall getThisCall() {
        return thisCall;
    }

    public void setThisCall(thisCall thisCall) {
        this.thisCall = thisCall;
    }

    public List<String> getIds() {
        return Ids;
    }

    public void setIds(List<String> ids) {
        Ids = ids;
    }

    public List<html> getHtmls() {
        return htmls;
    }

    public void setHtmls(List<html> htmls) {
        this.htmls = htmls;
    }

    public HtmlOpen getHtmlOpen() {
        return htmlOpen;
    }

    public void setHtmlOpen(HtmlOpen htmlOpen) {
        this.htmlOpen = htmlOpen;
    }

    public HtmlClose getHtmlClose() {
        return htmlClose;
    }

    public void setHtmlClose(HtmlClose htmlClose) {
        this.htmlClose = htmlClose;
    }

    public NgFor getNgFor() {
        return ngFor;
    }

    public void setNgFor(NgFor ngFor) {
        this.ngFor = ngFor;
    }

    public NgIf getNgIf() {
        return ngIf;
    }

    public void setNgIf(NgIf ngIf) {
        this.ngIf = ngIf;
    }

    public HtmlSingleLine getHtmlSingleLine() {
        return htmlSingleLine;
    }

    public void setHtmlSingleLine(HtmlSingleLine htmlSingleLine) {
        this.htmlSingleLine = htmlSingleLine;
    }



    public html() {
        super("html");
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("html : {\n");

        if (htmlOpen != null) {
            stringBuilder.append("  htmlOpen: ").append(htmlOpen).append("\n");
        }
        if (htmlClose != null) {
            stringBuilder.append("  htmlClose: ").append(htmlClose).append("\n");
        }
        if (ngFor != null) {
            stringBuilder.append("  ngFor: ").append(ngFor).append("\n");
        }
        if (ngIf != null) {
            stringBuilder.append("  ngIf: ").append(ngIf).append("\n");
        }
        if (htmlSingleLine != null) {
            stringBuilder.append("  htmlSingleLine: ").append(htmlSingleLine).append("\n");
        }

        if (htmls != null && !htmls.isEmpty()) {
            stringBuilder.append("  htmls: [\n");
            for (html h : htmls) {
                stringBuilder.append("    ").append(h).append(",\n");
            }
            stringBuilder.append("  ]\n");
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }


}
