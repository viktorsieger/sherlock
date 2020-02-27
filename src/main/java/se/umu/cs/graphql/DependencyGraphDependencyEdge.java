package se.umu.cs.graphql;

import java.util.*;

public class DependencyGraphDependencyEdge {

    private String cursor;
    private DependencyGraphDependency node;

    public DependencyGraphDependencyEdge() {
    }

    public DependencyGraphDependencyEdge(String cursor, DependencyGraphDependency node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DependencyGraphDependency getNode() {
        return node;
    }
    public void setNode(DependencyGraphDependency node) {
        this.node = node;
    }

}