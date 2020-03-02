package se.umu.cs.githubtypes;

public class CommitEdge {

    private String cursor;
    private Commit node;

    public CommitEdge() {
    }

    public CommitEdge(String cursor, Commit node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Commit getNode() {
        return node;
    }
    public void setNode(Commit node) {
        this.node = node;
    }

}