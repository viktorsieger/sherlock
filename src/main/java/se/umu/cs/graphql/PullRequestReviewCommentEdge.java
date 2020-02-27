package se.umu.cs.graphql;

import java.util.*;

public class PullRequestReviewCommentEdge {

    private String cursor;
    private PullRequestReviewComment node;

    public PullRequestReviewCommentEdge() {
    }

    public PullRequestReviewCommentEdge(String cursor, PullRequestReviewComment node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestReviewComment getNode() {
        return node;
    }
    public void setNode(PullRequestReviewComment node) {
        this.node = node;
    }

}