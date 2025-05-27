package AST;

public class Src extends  ASTNode {
    private String openSquare;
    private String src;
    private String closeSquare;
    private String equal;
    private String singleLineString;

    public Src() {
        super("src");
    }


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getOpenSquare() {
        return openSquare;
    }

    public void setOpenSquare(String openSquare) {
        this.openSquare = openSquare;
    }

    public String getCloseSquare() {
        return closeSquare;
    }

    public void setCloseSquare(String closeSquare) {
        this.closeSquare = closeSquare;
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
        return "Src { " +
                "openSquare='" + openSquare + "', " +
                "src='" + src + "', " +
                "closeSquare='" + closeSquare + "', " +
                "equal='" + equal + "', " +
                "singleLineString='" + singleLineString + "' " +
                "}";
    }
}
