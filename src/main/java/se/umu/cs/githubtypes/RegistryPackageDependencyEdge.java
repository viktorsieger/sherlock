package se.umu.cs.githubtypes;

public class RegistryPackageDependencyEdge {

    private String cursor;
    private RegistryPackageDependency node;

    public RegistryPackageDependencyEdge() {
    }

    public RegistryPackageDependencyEdge(String cursor, RegistryPackageDependency node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageDependency getNode() {
        return node;
    }
    public void setNode(RegistryPackageDependency node) {
        this.node = node;
    }

}