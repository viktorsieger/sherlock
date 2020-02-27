package se.umu.cs.graphql;

import java.util.*;

public class DeployKeyEdge {

    private String cursor;
    private DeployKey node;

    public DeployKeyEdge() {
    }

    public DeployKeyEdge(String cursor, DeployKey node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DeployKey getNode() {
        return node;
    }
    public void setNode(DeployKey node) {
        this.node = node;
    }

}