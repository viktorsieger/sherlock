package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageTagEdge {

    private String cursor;
    private RegistryPackageTag node;

    public RegistryPackageTagEdge() {
    }

    public RegistryPackageTagEdge(String cursor, RegistryPackageTag node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageTag getNode() {
        return node;
    }
    public void setNode(RegistryPackageTag node) {
        this.node = node;
    }

}