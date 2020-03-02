package se.umu.cs.githubtypes;

public class IssueEdge {

    private String cursor;
    private Issue node;

    public IssueEdge() {
    }

    public IssueEdge(String cursor, Issue node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Issue getNode() {
        return node;
    }
    public void setNode(Issue node) {
        this.node = node;
    }

}