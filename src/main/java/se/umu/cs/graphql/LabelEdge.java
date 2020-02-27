package se.umu.cs.graphql;

import java.util.*;

public class LabelEdge {

    private String cursor;
    private Label node;

    public LabelEdge() {
    }

    public LabelEdge(String cursor, Label node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Label getNode() {
        return node;
    }
    public void setNode(Label node) {
        this.node = node;
    }

}