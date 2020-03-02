package se.umu.cs.githubtypes;

public class ExternalIdentityEdge {

    private String cursor;
    private ExternalIdentity node;

    public ExternalIdentityEdge() {
    }

    public ExternalIdentityEdge(String cursor, ExternalIdentity node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ExternalIdentity getNode() {
        return node;
    }
    public void setNode(ExternalIdentity node) {
        this.node = node;
    }

}