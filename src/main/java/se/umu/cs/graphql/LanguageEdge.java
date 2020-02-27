package se.umu.cs.graphql;

import java.util.*;

public class LanguageEdge {

    private String cursor;
    private Language node;
    private Integer size;

    public LanguageEdge() {
    }

    public LanguageEdge(String cursor, Language node, Integer size) {
        this.cursor = cursor;
        this.node = node;
        this.size = size;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Language getNode() {
        return node;
    }
    public void setNode(Language node) {
        this.node = node;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

}