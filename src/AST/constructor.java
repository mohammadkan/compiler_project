package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class constructor extends ASTNode {

    public List<vv> vvs;
    public functionBody functionBody;

    public constructor() {
        super("constructor");
    }

    public AST.functionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(AST.functionBody functionBody) {
        this.functionBody = functionBody;
    }

    public List<vv> getVvs() {
        return vvs;
    }

    public void setVvs(List<vv> vvs) {
        this.vvs = vvs;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("constructor : {");
      stringBuilder.append("function body : "+ functionBody);
        if (vvs != null && !vvs.isEmpty()) {
            stringBuilder.append(" vvs [");
            for (int i = 0; i < vvs.size(); i++) {
                stringBuilder.append(vvs.get(i));
                if (i < vvs.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }


}
