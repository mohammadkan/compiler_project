package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class callFun extends ASTNode{
    public String identifier;
    public String idLeft;
    public String idRight;
    public List<String> ids;
    public List<String> strings;
    public List<Map> maps;
    public List<callFun> callFuns;

    public callFun() {
        super("callFun");
    }

    public String getId() {
        return identifier;
    }

    public void setId(String id) {
        this.identifier = id;
    }

    public String getIdLeft() {
        return idLeft;
    }

    public void setIdLeft(String idLeft) {
        this.idLeft = idLeft;
    }

    public String getIdRight() {
        return idRight;
    }

    public void setIdRight(String idRight) {
        this.idRight = idRight;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<Map> getMaps() {
        return maps;
    }

    public void setMaps(List<Map> maps) {
        this.maps = maps;
    }

    public List<callFun> getCallFuns() {
        return callFuns;
    }

    public void setCallFuns(List<callFun> callFuns) {
        this.callFuns = callFuns;
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("call fun :{");
      if (identifier != null) {
          stringBuilder.append("id :" + identifier);
      }

      stringBuilder.append("idLeft :" +idLeft + ", idRight: "+ idRight);
        if (ids != null && !ids.isEmpty()) {
            stringBuilder.append(" ids [");
            for (int i = 0; i < ids.size(); i++) {
                stringBuilder.append(ids.get(i));
                if (i < ids.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (maps != null && !maps.isEmpty()) {
            stringBuilder.append(" map [");
            for (int i = 0; i < maps.size(); i++) {
                stringBuilder.append(maps.get(i));
                if (i < maps.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        if (callFuns != null && !callFuns.isEmpty()) {
            stringBuilder.append(" call function [");
            for (int i = 0; i < callFuns.size(); i++) {
                stringBuilder.append(callFuns.get(i));
                if (i < callFuns.size() - 1) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();

    }


}
