package AST;

import Antlr.BaseVisitor;

import java.util.HashMap;
import java.util.Objects;

public class Map extends ASTNode {
   public java.util.Map<String , Object> map;

    public  Map() {
        super("Map");
        this.map = new HashMap<>();
    }

    public java.util.Map<String, Object> getMap() {
        return map;
    }

    public void setMap(java.util.Map<String, Object> map) {
        this.map = map;
    }
    public void addEntry(String key, ASTNode value) {
        map.put(key, value);
    }
@Override
   public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (java.util.Map.Entry<String, Object> entry :map.entrySet()) {
            stringBuilder.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append(",");
        }
        if (!map.isEmpty()) {
            stringBuilder.setLength(stringBuilder.length()-2);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
}


}
