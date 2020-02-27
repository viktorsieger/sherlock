package se.umu.cs.graphql;

import java.util.*;

public class PinnedIssueEdge {

    private String cursor;
    private PinnedIssue node;

    public PinnedIssueEdge() {
    }

    public PinnedIssueEdge(String cursor, PinnedIssue node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PinnedIssue getNode() {
        return node;
    }
    public void setNode(PinnedIssue node) {
        this.node = node;
    }

}