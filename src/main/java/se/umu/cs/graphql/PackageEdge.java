package se.umu.cs.graphql;

import java.util.*;

public class PackageEdge {

    private String cursor;
    private Package node;

    public PackageEdge() {
    }

    public PackageEdge(String cursor, Package node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Package getNode() {
        return node;
    }
    public void setNode(Package node) {
        this.node = node;
    }

}