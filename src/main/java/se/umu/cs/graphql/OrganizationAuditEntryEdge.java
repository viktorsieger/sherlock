package se.umu.cs.graphql;

import java.util.*;

public class OrganizationAuditEntryEdge {

    private String cursor;
    private OrganizationAuditEntry node;

    public OrganizationAuditEntryEdge() {
    }

    public OrganizationAuditEntryEdge(String cursor, OrganizationAuditEntry node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public OrganizationAuditEntry getNode() {
        return node;
    }
    public void setNode(OrganizationAuditEntry node) {
        this.node = node;
    }

}