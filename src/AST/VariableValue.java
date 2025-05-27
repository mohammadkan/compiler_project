package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class VariableValue extends ASTNode {
    public String string;
    public String id;
    public Integer decimal;
    public Array array;
    public Map map;
    public thisCall thisCall;
    public function2 function2;
    public callFun callFun;
    public function function;
    public List<vv> vvs;

    public VariableValue() {
        super("variable value");
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
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

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public AST.thisCall getThisCall() {
        return thisCall;
    }

    public void setThisCall(AST.thisCall thisCall) {
        this.thisCall = thisCall;
    }

    public AST.function2 getFunction2() {
        return function2;
    }

    public void setFunction2(AST.function2 function2) {
        this.function2 = function2;
    }

    public AST.callFun getCallFun() {
        return callFun;
    }

    public void setCallFun(AST.callFun callFun) {
        this.callFun = callFun;
    }

    public AST.function getFunction() {
        return function;
    }

    public void setFunction(AST.function function) {
        this.function = function;
    }

    public List<vv> getVvs() {
        return vvs;
    }

    public void setVvs(List<vv> vvs) {
        this.vvs = vvs;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("Variable value :{");
        stringBuilder.append("string" +string);
        stringBuilder.append("id" +id);
        stringBuilder.append("decimal" +decimal);
        stringBuilder.append("Array" +array);
        stringBuilder.append("function" +function);
        stringBuilder.append("function2" +function2);
        stringBuilder.append("thisCall" +thisCall);
        stringBuilder.append("callFun" +callFun);
        stringBuilder.append("map" +map);
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
