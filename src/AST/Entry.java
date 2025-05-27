package AST;

import Antlr.BaseVisitor;

public class Entry extends ASTNode {
    private final String key;
    private final Object value;

    public Entry(String key, Object value) {

        super("entry");
        this.key = key;
        this.value = value;

    }

    // Getters for the key and value
    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }


}
