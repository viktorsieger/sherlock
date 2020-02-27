package se.umu.cs.graphql;

import java.util.*;

public class CreatedCommitContributionEdge {

    private String cursor;
    private CreatedCommitContribution node;

    public CreatedCommitContributionEdge() {
    }

    public CreatedCommitContributionEdge(String cursor, CreatedCommitContribution node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CreatedCommitContribution getNode() {
        return node;
    }
    public void setNode(CreatedCommitContribution node) {
        this.node = node;
    }

}