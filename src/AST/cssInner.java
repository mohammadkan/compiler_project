package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class cssInner extends ASTNode {
    public cssKey cssKey;
    public String id;
    public List<String > numbers;
    public String number;
    public callFun callFun;

    public cssInner() {
        super("cssInner");
    }

    public AST.cssKey getCssKey() {
        return cssKey;
    }

    public void setCssKey(AST.cssKey cssKey) {
        this.cssKey = cssKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public AST.callFun getCallFun() {
        return callFun;
    }

    public void setCallFun(AST.callFun callFun) {
        this.callFun = callFun;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("css inner :{");
       stringBuilder.append("css key :").append(cssKey);
       stringBuilder.append("string:").append(id);
        if (numbers != null && !numbers.isEmpty()) {
            stringBuilder.append(" numbers with px [");
            for (int i = 0; i < numbers.size(); i++) {
                stringBuilder.append(numbers.get(i));
                if (i < numbers.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("number with hug :").append(number);
        stringBuilder.append("call fun :").append(callFun);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
