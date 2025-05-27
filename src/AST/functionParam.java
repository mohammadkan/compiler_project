package AST;

import Antlr.BaseVisitor;

public class functionParam extends ASTNode {
    public vv vv;
    public String id;

    public functionParam() {
        super("functionParam");
    }

    public AST.vv getVv() {
        return vv;
    }

    public void setVv(AST.vv vv) {
        this.vv = vv;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("function parameter : {");
       stringBuilder.append("vv :"+ vv);

       if (id != null) {
           stringBuilder.append("id :"+ id);
       }
        stringBuilder.append("}");
       return stringBuilder.toString();
    }


}
