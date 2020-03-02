package se.umu.cs.githubtypes;

public class PullRequestReviewThreadEdge {

    private String cursor;
    private PullRequestReviewThread node;

    public PullRequestReviewThreadEdge() {
    }

    public PullRequestReviewThreadEdge(String cursor, PullRequestReviewThread node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestReviewThread getNode() {
        return node;
    }
    public void setNode(PullRequestReviewThread node) {
        this.node = node;
    }

}