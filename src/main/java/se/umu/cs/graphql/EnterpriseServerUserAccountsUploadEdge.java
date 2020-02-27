package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountsUploadEdge {

    private String cursor;
    private EnterpriseServerUserAccountsUpload node;

    public EnterpriseServerUserAccountsUploadEdge() {
    }

    public EnterpriseServerUserAccountsUploadEdge(String cursor, EnterpriseServerUserAccountsUpload node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseServerUserAccountsUpload getNode() {
        return node;
    }
    public void setNode(EnterpriseServerUserAccountsUpload node) {
        this.node = node;
    }

}