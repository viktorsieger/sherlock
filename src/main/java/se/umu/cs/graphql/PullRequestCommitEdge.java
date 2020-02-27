package se.umu.cs.graphql;

import java.util.*;

public class PullRequestCommitEdge {

    private String cursor;
    private PullRequestCommit node;

    public PullRequestCommitEdge() {
    }

    public PullRequestCommitEdge(String cursor, PullRequestCommit node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestCommit getNode() {
        return node;
    }
    public void setNode(PullRequestCommit node) {
        this.node = node;
    }

}