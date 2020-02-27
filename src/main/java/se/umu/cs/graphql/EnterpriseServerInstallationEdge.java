package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerInstallationEdge {

    private String cursor;
    private EnterpriseServerInstallation node;

    public EnterpriseServerInstallationEdge() {
    }

    public EnterpriseServerInstallationEdge(String cursor, EnterpriseServerInstallation node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerInstallation getNode() {
        return node;
    }
    public void setNode(EnterpriseServerInstallation node) {
        this.node = node;
    }

}