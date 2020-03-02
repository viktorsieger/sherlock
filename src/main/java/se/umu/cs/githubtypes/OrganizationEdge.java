package se.umu.cs.githubtypes;

public class OrganizationEdge {

    private String cursor;
    private Organization node;

    public OrganizationEdge() {
    }

    public OrganizationEdge(String cursor, Organization node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Organization getNode() {
        return node;
    }
    public void setNode(Organization node) {
        this.node = node;
    }

}