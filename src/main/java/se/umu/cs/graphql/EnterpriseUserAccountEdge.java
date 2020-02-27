package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseUserAccountEdge {

    private String cursor;
    private EnterpriseUserAccount node;

    public EnterpriseUserAccountEdge() {
    }

    public EnterpriseUserAccountEdge(String cursor, EnterpriseUserAccount node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseUserAccount getNode() {
        return node;
    }
    public void setNode(EnterpriseUserAccount node) {
        this.node = node;
    }

}