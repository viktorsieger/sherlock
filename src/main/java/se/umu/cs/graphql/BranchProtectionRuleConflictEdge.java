package se.umu.cs.graphql;

import java.util.*;

public class BranchProtectionRuleConflictEdge {

    private String cursor;
    private BranchProtectionRuleConflict node;

    public BranchProtectionRuleConflictEdge() {
    }

    public BranchProtectionRuleConflictEdge(String cursor, BranchProtectionRuleConflict node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public BranchProtectionRuleConflict getNode() {
        return node;
    }
    public void setNode(BranchProtectionRuleConflict node) {
        this.node = node;
    }

}