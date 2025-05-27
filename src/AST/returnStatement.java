package AST;

import Antlr.BaseVisitor;

public class returnStatement extends ASTNode {
   public thisCall thisCall;
    public String string;
    public String id;
    public Integer decimal;
    public Array array;


    public returnStatement() {
        super("return Statement");
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

    public AST.thisCall getThisCall() {
        return thisCall;
    }

    public void setThisCall(AST.thisCall thisCall) {
        this.thisCall = thisCall;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("return statement: {");
        stringBuilder.append(thisCall).append(",");
        stringBuilder.append("id").append(id);
        stringBuilder.append(string).append(",");      ;
        stringBuilder.append(decimal).append(",");
        stringBuilder.append(array);

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
