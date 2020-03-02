package se.umu.cs.githubtypes;

public class ReleaseEdge {

    private String cursor;
    private Release node;

    public ReleaseEdge() {
    }

    public ReleaseEdge(String cursor, Release node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Release getNode() {
        return node;
    }
    public void setNode(Release node) {
        this.node = node;
    }

}