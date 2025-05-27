package AST;

import Antlr.BaseVisitor;

import java.io.StringReader;
import java.util.List;

public class Variable extends ASTNode {

    public String name;
    public String modifier;
    public String visibility;
    public vv vvs;
    public List<dd> dds;
    public VariableValue value;

    public Variable() {
        super("variable");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public vv getVvs() {
        return vvs;
    }

    public void setVvs(vv vvs) {
        this.vvs = vvs;
    }

    public List<dd> getDds() {
        return dds;
    }

    public void setDds(List<dd> dds) {
        this.dds = dds;
    }

    public VariableValue getValue() {
        return value;
    }

    public void setValue(VariableValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("Variable :{");

       stringBuilder.append("visibility").append(visibility);
       stringBuilder.append("modifier" + modifier);
       stringBuilder.append("name" + name);

     stringBuilder.append("vv" + vvs);
        if (dds != null && !dds.isEmpty()) {
            stringBuilder.append(" dds [");
            for (int i = 0; i < dds.size(); i++) {
                stringBuilder.append(dds.get(i));
                if (i < dds.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");

        }
        stringBuilder.append("value").append(value);
        stringBuilder.append("}");

        return stringBuilder.toString();
    }



}
