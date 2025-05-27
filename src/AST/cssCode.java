package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class cssCode extends ASTNode  {
    public List<cssKey> cssKeys;
    public List<cssInner> cssInners;

    public cssCode() {
        super("css");
    }

    public List<cssKey> getCssKeys() {
        return cssKeys;
    }

    public void setCssKeys(List<cssKey> cssKeys) {
        this.cssKeys = cssKeys;
    }

    public List<cssInner> getCssInners() {
        return cssInners;
    }

    public void setCssInners(List<cssInner> cssInners) {
        this.cssInners = cssInners;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("css code :{");
        if (cssKeys != null && !cssKeys.isEmpty()) {
            stringBuilder.append("css key [");
            for (int i = 0; i < cssKeys.size(); i++) {
                stringBuilder.append(cssKeys.get(i));
                if (i < cssKeys.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (cssInners != null && !cssInners.isEmpty()) {
            stringBuilder.append("css inner [");
            for (int i = 0; i < cssInners.size(); i++) {
                stringBuilder.append(cssInners.get(i));
                if (i < cssInners.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }



}
