package se.umu.cs.githubtypes;

public class CommitCommentEdge {

    private String cursor;
    private CommitComment node;

    public CommitCommentEdge() {
    }

    public CommitCommentEdge(String cursor, CommitComment node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CommitComment getNode() {
        return node;
    }
    public void setNode(CommitComment node) {
        this.node = node;
    }

}