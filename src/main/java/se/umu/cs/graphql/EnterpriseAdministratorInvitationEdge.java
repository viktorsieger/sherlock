package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseAdministratorInvitationEdge {

    private String cursor;
    private EnterpriseAdministratorInvitation node;

    public EnterpriseAdministratorInvitationEdge() {
    }

    public EnterpriseAdministratorInvitationEdge(String cursor, EnterpriseAdministratorInvitation node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseAdministratorInvitation getNode() {
        return node;
    }
    public void setNode(EnterpriseAdministratorInvitation node) {
        this.node = node;
    }

}