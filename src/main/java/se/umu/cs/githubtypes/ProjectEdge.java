package se.umu.cs.githubtypes;

public class ProjectEdge {

    private String cursor;
    private Project node;

    public ProjectEdge() {
    }

    public ProjectEdge(String cursor, Project node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Project getNode() {
        return node;
    }
    public void setNode(Project node) {
        this.node = node;
    }

}