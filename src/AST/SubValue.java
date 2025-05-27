package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class SubValue extends ASTNode {
    public String string;
    public String id;
    public Integer decimal;
    public List<cssCode> cssCode;

    public SubValue() {
        super("subValue");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDecimal() {
        return decimal;
    }

    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

    public List<AST.cssCode> getCssCode() {
        return cssCode;
    }

    public void setCssCode(List<AST.cssCode> cssCode) {
        this.cssCode = cssCode;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SubValue :{");
        stringBuilder.append("string :").append(string);
        stringBuilder.append("id :").append(id);
        stringBuilder.append("decimal :").append(decimal);
        if (cssCode != null && !cssCode.isEmpty()) {
            stringBuilder.append("css codes [");
            for (int i = 0; i < cssCode.size(); i++) {
                stringBuilder.append(cssCode.get(i));
                if (i < cssCode.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
