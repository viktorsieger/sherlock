package se.umu.cs.githubtypes;

public class PushAllowanceEdge {

    private String cursor;
    private PushAllowance node;

    public PushAllowanceEdge() {
    }

    public PushAllowanceEdge(String cursor, PushAllowance node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PushAllowance getNode() {
        return node;
    }
    public void setNode(PushAllowance node) {
        this.node = node;
    }

}