package se.umu.cs.graphql;

import java.util.*;

public class CheckRunEdge {

    private String cursor;
    private CheckRun node;

    public CheckRunEdge() {
    }

    public CheckRunEdge(String cursor, CheckRun node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckRun getNode() {
        return node;
    }
    public void setNode(CheckRun node) {
        this.node = node;
    }

}