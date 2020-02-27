package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseAdministratorEdge {

    private String cursor;
    private User node;
    private EnterpriseAdministratorRole role;

    public EnterpriseAdministratorEdge() {
    }

    public EnterpriseAdministratorEdge(String cursor, User node, EnterpriseAdministratorRole role) {
        this.cursor = cursor;
        this.node = node;
        this.role = role;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public User getNode() {
        return node;
    }
    public void setNode(User node) {
        this.node = node;
    }

    public EnterpriseAdministratorRole getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRole role) {
        this.role = role;
    }

}