package se.umu.cs.githubtypes;

public class PackageVersionEdge {

    private String cursor;
    private PackageVersion node;

    public PackageVersionEdge() {
    }

    public PackageVersionEdge(String cursor, PackageVersion node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PackageVersion getNode() {
        return node;
    }
    public void setNode(PackageVersion node) {
        this.node = node;
    }

}