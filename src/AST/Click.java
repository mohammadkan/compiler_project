package AST;

public class Click extends ASTNode {
    String open_prack,close_prack,click,equal,text;

    public Click() {
        super("Click");
    }

    public String getOpen_prack() {
        return open_prack;
    }

    public void setOpen_prack(String open_prack) {
        this.open_prack = open_prack;
    }

    public String getClose_prack() {
        return close_prack;
    }

    public void setClose_prack(String close_prack) {
        this.close_prack = close_prack;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Click { ");

        sb.append("open_prack='").append(open_prack).append("', ");
        sb.append("close_prack='").append(close_prack).append("', ");
        sb.append("click='").append(click).append("', ");
        sb.append("equal='").append(equal).append("', ");
        sb.append("text='").append(text).append("' ");

        sb.append("}");

        return sb.toString();
    }



}
