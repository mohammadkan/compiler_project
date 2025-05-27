package AST;

public class NgIf extends ASTNode {
    private String multi;
    private String ngIf;
    private String equal;
    private String singleLineString;

    public NgIf() {
        super("ngIf");
    }


    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    public String getNgIf() {
        return ngIf;
    }

    public void setNgIf(String ngIf) {
        this.ngIf = ngIf;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getSingleLineString() {
        return singleLineString;
    }

    public void setSingleLineString(String singleLineString) {
        this.singleLineString = singleLineString;
    }

    @Override
    public String toString() {
        return "NgIf { " +
                "multi='" + multi + "', " +
                "ngIf='" + ngIf + "', " +
                "equal='" + equal + "', " +
                "singleLineString='" + singleLineString + "' " +
                "}";
    }
}
