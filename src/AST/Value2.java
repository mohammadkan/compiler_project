package AST;

import Antlr.BaseVisitor;

public class Value2 extends ASTNode{
    public OnClick onClick;
    public attributeValue attributeValue;
    public String idLeft;
    public String idRight;

    public Value2() {
        super("Value2");
    }

    public OnClick getOnClick() {
        return onClick;
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public AST.attributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AST.attributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getIdLeft() {
        return idLeft;
    }

    public void setIdLeft(String idLeft) {
        this.idLeft = idLeft;
    }

    public String getIdRight() {
        return idRight;
    }

    public void setIdRight(String idRight) {
        this.idRight = idRight;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("value 2 :{");
       stringBuilder.append("onclick :").append(onClick);
       stringBuilder.append("attributeValue :" +attributeValue);
       stringBuilder.append( "id left :" +idLeft + "id right :"+ idRight);
        stringBuilder.append("}");
    return stringBuilder.toString();
    }


}
