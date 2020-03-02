package se.umu.cs.githubtypes;

public class DeploymentStatusEdge {

    private String cursor;
    private DeploymentStatus node;

    public DeploymentStatusEdge() {
    }

    public DeploymentStatusEdge(String cursor, DeploymentStatus node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DeploymentStatus getNode() {
        return node;
    }
    public void setNode(DeploymentStatus node) {
        this.node = node;
    }

}