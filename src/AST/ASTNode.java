package AST;

import Antlr.BaseVisitor;
import org.antlr.runtime.tree.TreeWizard;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    private String type;
    private List<ASTNode> children;

    public ASTNode(String type) {
        this.type = type;
        this.children = new ArrayList<>();
    }
    public void addChild(ASTNode child) {
        this.children.add(child);
    }
    public List<ASTNode> getChildren() {
        return this.children;
    }


    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "\nASTNode{" +
                "\ntype='" + type + '\'' +
                "\n, children=" + children +
                '}';
    }


}
