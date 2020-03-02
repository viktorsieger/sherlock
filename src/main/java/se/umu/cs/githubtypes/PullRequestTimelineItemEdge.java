package se.umu.cs.githubtypes;

public class PullRequestTimelineItemEdge {

    private String cursor;
    private PullRequestTimelineItem node;

    public PullRequestTimelineItemEdge() {
    }

    public PullRequestTimelineItemEdge(String cursor, PullRequestTimelineItem node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PullRequestTimelineItem getNode() {
        return node;
    }
    public void setNode(PullRequestTimelineItem node) {
        this.node = node;
    }

}