package se.umu.cs.graphql;

import java.util.*;

public class SponsorshipEdge {

    private String cursor;
    private Sponsorship node;

    public SponsorshipEdge() {
    }

    public SponsorshipEdge(String cursor, Sponsorship node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Sponsorship getNode() {
        return node;
    }
    public void setNode(Sponsorship node) {
        this.node = node;
    }

}