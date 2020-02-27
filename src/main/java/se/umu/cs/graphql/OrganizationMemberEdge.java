package se.umu.cs.graphql;

import java.util.*;

public class OrganizationMemberEdge {

    private String cursor;
    private Boolean hasTwoFactorEnabled;
    private User node;
    private OrganizationMemberRole role;

    public OrganizationMemberEdge() {
    }

    public OrganizationMemberEdge(String cursor, Boolean hasTwoFactorEnabled, User node, OrganizationMemberRole role) {
        this.cursor = cursor;
        this.hasTwoFactorEnabled = hasTwoFactorEnabled;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getHasTwoFactorEnabled() {
        return hasTwoFactorEnabled;
    }
    public void setHasTwoFactorEnabled(Boolean hasTwoFactorEnabled) {
        this.hasTwoFactorEnabled = hasTwoFactorEnabled;
    }

    public User getNode() {
        return node;
    }
    public void setNode(User node) {
        this.node = node;
    }

    public OrganizationMemberRole getRole() {
        return role;
    }
    public void setRole(OrganizationMemberRole role) {
        this.role = role;
    }

}