package se.umu.cs.githubtypes;

public class IssueCommentEdge {

    private String cursor;
    private IssueComment node;

    public IssueCommentEdge() {
    }

    public IssueCommentEdge(String cursor, IssueComment node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueComment getNode() {
        return node;
    }
    public void setNode(IssueComment node) {
        this.node = node;
    }

}