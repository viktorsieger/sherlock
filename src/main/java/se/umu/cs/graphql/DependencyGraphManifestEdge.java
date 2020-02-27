package se.umu.cs.graphql;

import java.util.*;

public class DependencyGraphManifestEdge {

    private String cursor;
    private DependencyGraphManifest node;

    public DependencyGraphManifestEdge() {
    }

    public DependencyGraphManifestEdge(String cursor, DependencyGraphManifest node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public DependencyGraphManifest getNode() {
        return node;
    }
    public void setNode(DependencyGraphManifest node) {
        this.node = node;
    }

}