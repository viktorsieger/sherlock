package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageEdge {

    private String cursor;
    private RegistryPackage node;

    public RegistryPackageEdge() {
    }

    public RegistryPackageEdge(String cursor, RegistryPackage node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public RegistryPackage getNode() {
        return node;
    }
    public void setNode(RegistryPackage node) {
        this.node = node;
    }

}