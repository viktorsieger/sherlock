package se.umu.cs.graphql;

import java.util.*;

public class DeploymentEdge {

    private String cursor;
    private Deployment node;

    public DeploymentEdge() {
    }

    public DeploymentEdge(String cursor, Deployment node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Deployment getNode() {
        return node;
    }
    public void setNode(Deployment node) {
        this.node = node;
    }

}