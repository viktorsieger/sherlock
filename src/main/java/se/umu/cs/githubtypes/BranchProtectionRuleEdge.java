package se.umu.cs.githubtypes;

public class BranchProtectionRuleEdge {

    private String cursor;
    private BranchProtectionRule node;

    public BranchProtectionRuleEdge() {
    }

    public BranchProtectionRuleEdge(String cursor, BranchProtectionRule node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public BranchProtectionRule getNode() {
        return node;
    }
    public void setNode(BranchProtectionRule node) {
        this.node = node;
    }

}