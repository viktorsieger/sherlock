package se.umu.cs.githubtypes;

public class ReviewRequestEdge {

    private String cursor;
    private ReviewRequest node;

    public ReviewRequestEdge() {
    }

    public ReviewRequestEdge(String cursor, ReviewRequest node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReviewRequest getNode() {
        return node;
    }
    public void setNode(ReviewRequest node) {
        this.node = node;
    }

}