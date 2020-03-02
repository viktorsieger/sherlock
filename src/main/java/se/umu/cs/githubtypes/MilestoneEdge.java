package se.umu.cs.githubtypes;

public class MilestoneEdge {

    private String cursor;
    private Milestone node;

    public MilestoneEdge() {
    }

    public MilestoneEdge(String cursor, Milestone node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Milestone getNode() {
        return node;
    }
    public void setNode(Milestone node) {
        this.node = node;
    }

}