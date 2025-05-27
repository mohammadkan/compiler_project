package AST;

import Antlr.BaseVisitor;

public class htmlId extends ASTNode {
    public String isMulti;
    public String id;
    public Value2 value2;

    public htmlId() {
        super("htmlId");
    }

    public String getIsMulti() {
        return isMulti;
    }

    public void setIsMulti(String isMulti) {
        this.isMulti = isMulti;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Value2 getValue2() {
        return value2;
    }

    public void setValue2(Value2 value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("html ids :{");
       stringBuilder.append("isMutli" + isMulti);
       stringBuilder.append("id :" +id);
       stringBuilder.append("value2 :" +value2).append("}");
       return stringBuilder.toString();
    }


}
