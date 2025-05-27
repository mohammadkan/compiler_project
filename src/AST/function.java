package AST;

import java.util.List;

public class function extends ASTNode {
    public String name;
    public List<functionParam>functionParams;
    public vv vv;
    public List<dd>ddList;
    public functionBody functionBody;
    public returnStatement returnStatement;

    public function() {
        super("function");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<functionParam> getFunctionParams() {
        return functionParams;
    }

    public void setFunctionParams(List<functionParam> functionParams) {
        this.functionParams = functionParams;
    }


    public AST.vv getVv() {
        return vv;
    }

    public void setVv(AST.vv vv) {
        this.vv = vv;
    }

    public List<dd> getDdList() {
        return ddList;
    }

    public void setDdList(List<dd> ddList) {
        this.ddList = ddList;
    }

    public AST.functionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(AST.functionBody functionBody) {
        this.functionBody = functionBody;
    }

    public AST.returnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(AST.returnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("function :{");
     if (name != null) {
         stringBuilder.append("name" + name);
     }
        stringBuilder.append("vv").append(vv);
        if (ddList != null && !ddList.isEmpty()) {
            stringBuilder.append(" dd");
            for (int i = 0; i < ddList.size(); i++) {
                stringBuilder.append(ddList.get(i));
                if (i < ddList.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }

        if (functionParams != null && !functionParams.isEmpty()) {
            stringBuilder.append(" function parameters [");
            for (int i = 0; i <
                 functionParams.size(); i++) {
                stringBuilder.append(
                        functionParams.get(i));
                if (i <
                functionParams.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("function body ").append(functionBody);
        if (returnStatement != null) {
            stringBuilder.append("return statement").append(returnStatement);
        }
        stringBuilder.append("}");
       return  stringBuilder.toString();
    }


}
