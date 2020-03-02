package se.umu.cs.githubtypes;

public class PullRequestChangedFileEdge {

    private String cursor;
    private PullRequestChangedFile node;

    public PullRequestChangedFileEdge() {
    }

    public PullRequestChangedFileEdge(String cursor, PullRequestChangedFile node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestChangedFile getNode() {
        return node;
    }
    public void setNode(PullRequestChangedFile node) {
        this.node = node;
    }

}