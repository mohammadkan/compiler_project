package AST;

public class Row {
    String name;
    String type;
    String value;
    Integer scope_level = 1;

    public Integer getScope_level() {
        return scope_level;
    }

    public void setScope_level(Integer scope_level) {
        this.scope_level = scope_level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return String.format("%-20s\t%-30s\t%-20s\t%-20s", name, value, type);
//    }

}
