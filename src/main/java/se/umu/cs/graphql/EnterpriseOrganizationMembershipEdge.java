package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseOrganizationMembershipEdge {

    private String cursor;
    private Organization node;
    private EnterpriseUserAccountMembershipRole role;

    public EnterpriseOrganizationMembershipEdge() {
    }

    public EnterpriseOrganizationMembershipEdge(String cursor, Organization node, EnterpriseUserAccountMembershipRole role) {
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

    public Organization getNode() {
        return node;
    }
    public void setNode(Organization node) {
        this.node = node;
    }

    public EnterpriseUserAccountMembershipRole getRole() {
        return role;
    }
    public void setRole(EnterpriseUserAccountMembershipRole role) {
        this.role = role;
    }

}