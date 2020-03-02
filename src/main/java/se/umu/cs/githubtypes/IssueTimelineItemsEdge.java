package se.umu.cs.githubtypes;

public class IssueTimelineItemsEdge {

    private String cursor;
    private IssueTimelineItems node;

    public IssueTimelineItemsEdge() {
    }

    public IssueTimelineItemsEdge(String cursor, IssueTimelineItems node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public IssueTimelineItems getNode() {
        return node;
    }
    public void setNode(IssueTimelineItems node) {
        this.node = node;
    }

}