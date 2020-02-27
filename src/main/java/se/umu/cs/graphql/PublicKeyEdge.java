package se.umu.cs.graphql;

import java.util.*;

public class PublicKeyEdge {

    private String cursor;
    private PublicKey node;

    public PublicKeyEdge() {
    }

    public PublicKeyEdge(String cursor, PublicKey node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public PublicKey getNode() {
        return node;
    }
    public void setNode(PublicKey node) {
        this.node = node;
    }

}