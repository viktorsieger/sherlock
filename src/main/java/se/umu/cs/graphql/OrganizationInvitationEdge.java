package se.umu.cs.graphql;

import java.util.*;

public class OrganizationInvitationEdge {

    private String cursor;
    private OrganizationInvitation node;

    public OrganizationInvitationEdge() {
    }

    public OrganizationInvitationEdge(String cursor, OrganizationInvitation node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public OrganizationInvitation getNode() {
        return node;
    }
    public void setNode(OrganizationInvitation node) {
        this.node = node;
    }

}