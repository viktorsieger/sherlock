package se.umu.cs.githubtypes;

public class ReviewDismissalAllowanceEdge {

    private String cursor;
    private ReviewDismissalAllowance node;

    public ReviewDismissalAllowanceEdge() {
    }

    public ReviewDismissalAllowanceEdge(String cursor, ReviewDismissalAllowance node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReviewDismissalAllowance getNode() {
        return node;
    }
    public void setNode(ReviewDismissalAllowance node) {
        this.node = node;
    }

}