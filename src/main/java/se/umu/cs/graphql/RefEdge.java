package se.umu.cs.graphql;

import java.util.*;

public class RefEdge {

    private String cursor;
    private Ref node;

    public RefEdge() {
    }

    public RefEdge(String cursor, Ref node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Ref getNode() {
        return node;
    }
    public void setNode(Ref node) {
        this.node = node;
    }

}