package AST;

public class Print extends ASTNode {
    public String string;
    public thisCall thisCall;

    public Print() {
        super("print");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    public AST.thisCall getThisCall() {
        return thisCall;
    }
    public void setThisCall(AST.thisCall thisCall) {
        this.thisCall = thisCall;
    }
    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("print : {");
      if (string != null) {
          stringBuilder.append("string" + string);
      }if (thisCall != null) {
            stringBuilder.append("this call :" + thisCall);
        }
       stringBuilder.append("}");
       return stringBuilder.toString();
    }
}

