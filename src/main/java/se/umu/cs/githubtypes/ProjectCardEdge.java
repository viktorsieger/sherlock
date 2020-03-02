package se.umu.cs.githubtypes;

public class ProjectCardEdge {

    private String cursor;
    private ProjectCard node;

    public ProjectCardEdge() {
    }

    public ProjectCardEdge(String cursor, ProjectCard node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ProjectCard getNode() {
        return node;
    }
    public void setNode(ProjectCard node) {
        this.node = node;
    }

}