package AST;

import java.util.List;

public class ComponentConfig extends ASTNode {
    private Selector selector;
    private TemplateUrl templateUrl;
    private Template template;
    private StyleUrls styleUrls;

    public ComponentConfig(Selector selector, TemplateUrl templateUrl, Template template, StyleUrls styleUrls) {
        super("ComponentConfig");
        this.selector = selector;
        this.templateUrl = templateUrl;
        this.template = template;
        this.styleUrls = styleUrls;
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public TemplateUrl getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(TemplateUrl templateUrl) {
        this.templateUrl = templateUrl;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public StyleUrls getStyleUrls() {
        return styleUrls;
    }

    public void setStyleUrls(StyleUrls styleUrls) {
        this.styleUrls = styleUrls;
    }

    @Override
    public String toString() {
        return "ComponentConfig{" +
                "selector=" + selector +
                ", templateUrl=" + templateUrl +
                ", template=" + template +
                ", styleUrls=" + styleUrls +
                '}';
    }
}
