package se.umu.cs.graphql;

import java.util.*;

public class PullRequestReviewEdge {

    private String cursor;
    private PullRequestReview node;

    public PullRequestReviewEdge() {
    }

    public PullRequestReviewEdge(String cursor, PullRequestReview node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestReview getNode() {
        return node;
    }
    public void setNode(PullRequestReview node) {
        this.node = node;
    }

}