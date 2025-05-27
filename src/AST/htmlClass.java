package AST;

import Antlr.BaseVisitor;

public class htmlClass extends ASTNode {
    public String className;
    public Value2 value2;

    public htmlClass() {
        super("html class");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
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
        stringBuilder.append("class name :" +className);
        stringBuilder.append("value2 :" +value2).append("}");
        return stringBuilder.toString();
    }


}
