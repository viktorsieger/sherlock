package se.umu.cs.graphql;

import java.util.*;

public class PullRequestEdge {

    private String cursor;
    private PullRequest node;

    public PullRequestEdge() {
    }

    public PullRequestEdge(String cursor, PullRequest node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequest getNode() {
        return node;
    }
    public void setNode(PullRequest node) {
        this.node = node;
    }

}