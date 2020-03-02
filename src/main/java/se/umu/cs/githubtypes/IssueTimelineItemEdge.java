package se.umu.cs.githubtypes;

public class IssueTimelineItemEdge {

    private String cursor;
    private IssueTimelineItem node;

    public IssueTimelineItemEdge() {
    }

    public IssueTimelineItemEdge(String cursor, IssueTimelineItem node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueTimelineItem getNode() {
        return node;
    }
    public void setNode(IssueTimelineItem node) {
        this.node = node;
    }

}