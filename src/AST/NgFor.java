package AST;

public class NgFor extends ASTNode{
    private String multi;
    private String ngFor;
    private String equal;
    private String singleLineString;

    public NgFor() {
        super("ngFor");
    }

    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

    public String getNgFor() {
        return ngFor;
    }

    public void setNgFor(String ngFor) {
        this.ngFor = ngFor;
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
        return "NgFor { " +
                "multi='" + multi + "', " +
                "ngFor='" + ngFor + "', " +
                "equal='" + equal + "', " +
                "singleLineString='" + singleLineString + "' " +
                "}";
    }
}
