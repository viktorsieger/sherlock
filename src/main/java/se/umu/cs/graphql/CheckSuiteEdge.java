package se.umu.cs.graphql;

import java.util.*;

public class CheckSuiteEdge {

    private String cursor;
    private CheckSuite node;

    public CheckSuiteEdge() {
    }

    public CheckSuiteEdge(String cursor, CheckSuite node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public CheckSuite getNode() {
        return node;
    }
    public void setNode(CheckSuite node) {
        this.node = node;
    }

}