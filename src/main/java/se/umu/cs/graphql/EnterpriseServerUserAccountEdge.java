package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountEdge {

    private String cursor;
    private EnterpriseServerUserAccount node;

    public EnterpriseServerUserAccountEdge() {
    }

    public EnterpriseServerUserAccountEdge(String cursor, EnterpriseServerUserAccount node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerUserAccount getNode() {
        return node;
    }
    public void setNode(EnterpriseServerUserAccount node) {
        this.node = node;
    }

}