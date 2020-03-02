package se.umu.cs.githubtypes;

public class CheckAnnotationEdge {

    private String cursor;
    private CheckAnnotation node;

    public CheckAnnotationEdge() {
    }

    public CheckAnnotationEdge(String cursor, CheckAnnotation node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckAnnotation getNode() {
        return node;
    }
    public void setNode(CheckAnnotation node) {
        this.node = node;
    }

}