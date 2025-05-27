package AST;

import Antlr.BaseVisitor;

public class dd extends ASTNode {
    public String dataType;

    public dd() {
        super("dd");
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "\ndd{" +
                "\ndataType='" + dataType + '\'' +
                '}';
    }


}
