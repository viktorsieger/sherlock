package se.umu.cs.graphql;

import java.util.*;

public class SecurityAdvisoryEdge {

    private String cursor;
    private SecurityAdvisory node;

    public SecurityAdvisoryEdge() {
    }

    public SecurityAdvisoryEdge(String cursor, SecurityAdvisory node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SecurityAdvisory getNode() {
        return node;
    }
    public void setNode(SecurityAdvisory node) {
        this.node = node;
    }

}