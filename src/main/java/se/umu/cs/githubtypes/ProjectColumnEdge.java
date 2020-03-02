package se.umu.cs.githubtypes;

public class ProjectColumnEdge {

    private String cursor;
    private ProjectColumn node;

    public ProjectColumnEdge() {
    }

    public ProjectColumnEdge(String cursor, ProjectColumn node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ProjectColumn getNode() {
        return node;
    }
    public void setNode(ProjectColumn node) {
        this.node = node;
    }

}