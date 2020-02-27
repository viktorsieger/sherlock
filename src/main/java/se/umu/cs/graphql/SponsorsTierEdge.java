package se.umu.cs.graphql;

import java.util.*;

public class SponsorsTierEdge {

    private String cursor;
    private SponsorsTier node;

    public SponsorsTierEdge() {
    }

    public SponsorsTierEdge(String cursor, SponsorsTier node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SponsorsTier getNode() {
        return node;
    }
    public void setNode(SponsorsTier node) {
        this.node = node;
    }

}