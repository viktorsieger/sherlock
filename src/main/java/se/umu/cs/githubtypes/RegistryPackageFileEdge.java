package se.umu.cs.githubtypes;

public class RegistryPackageFileEdge {

    private String cursor;
    private RegistryPackageFile node;

    public RegistryPackageFileEdge() {
    }

    public RegistryPackageFileEdge(String cursor, RegistryPackageFile node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageFile getNode() {
        return node;
    }
    public void setNode(RegistryPackageFile node) {
        this.node = node;
    }

}