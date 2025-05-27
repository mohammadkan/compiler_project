package AST;

import Antlr.BaseVisitor;

import java.util.List;

public class ImportR extends ASTNode {

    public String from;
    public String signal;
    public List<String> identifiers;

    public ImportR() {
        super("Import");
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }

    public List<String> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder("Import :{");
       if (identifiers!= null && !identifiers.isEmpty()) {
           stringBuilder.append("ids :[");
           for (int i=0;i<identifiers.size();i++) {
               stringBuilder.append(identifiers.get(i));
               if (i < identifiers.size()-1) {
                   stringBuilder.append(",");
               }
           }
           stringBuilder.append("]");
       }
       stringBuilder.append("from ").append(from);
       if (signal!= null) {
           stringBuilder.append("signal").append(signal);
       }
       stringBuilder.append("}");
       return stringBuilder.toString();
    }


}

