package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountEmailEdge {

    private String cursor;
    private EnterpriseServerUserAccountEmail node;

    public EnterpriseServerUserAccountEmailEdge() {
    }

    public EnterpriseServerUserAccountEmailEdge(String cursor, EnterpriseServerUserAccountEmail node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerUserAccountEmail getNode() {
        return node;
    }
    public void setNode(EnterpriseServerUserAccountEmail node) {
        this.node = node;
    }

}