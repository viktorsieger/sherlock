package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageVersionEdge {

    private String cursor;
    private RegistryPackageVersion node;

    public RegistryPackageVersionEdge() {
    }

    public RegistryPackageVersionEdge(String cursor, RegistryPackageVersion node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackageVersion getNode() {
        return node;
    }
    public void setNode(RegistryPackageVersion node) {
        this.node = node;
    }

}