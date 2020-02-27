package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseRepositoryInfoEdge {

    private String cursor;
    private EnterpriseRepositoryInfo node;

    public EnterpriseRepositoryInfoEdge() {
    }

    public EnterpriseRepositoryInfoEdge(String cursor, EnterpriseRepositoryInfo node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public EnterpriseRepositoryInfo getNode() {
        return node;
    }
    public void setNode(EnterpriseRepositoryInfo node) {
        this.node = node;
    }

}