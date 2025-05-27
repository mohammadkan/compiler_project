package AST;

import Antlr.BaseVisitor;

public class OnClick extends ASTNode{


    public function2 function2;
    public String id;

    public OnClick() {
        super("on click");
    }

    public AST.function2 getFunction2() {
        return function2;
    }

    public void setFunction2(AST.function2 function2) {
        this.function2 = function2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("on click : {");
       stringBuilder.append("function 2 :").append(function2);
       stringBuilder.append("id :").append(id);
        stringBuilder.append("}");
       return stringBuilder.toString();
    }


}
