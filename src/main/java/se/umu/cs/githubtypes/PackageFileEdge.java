package se.umu.cs.githubtypes;

public class PackageFileEdge {

    private String cursor;
    private PackageFile node;

    public PackageFileEdge() {
    }

    public PackageFileEdge(String cursor, PackageFile node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PackageFile getNode() {
        return node;
    }
    public void setNode(PackageFile node) {
        this.node = node;
    }

}