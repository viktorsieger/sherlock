package se.umu.cs.graphql;

import java.util.*;

public class MarketplaceListingEdge {

    private String cursor;
    private MarketplaceListing node;

    public MarketplaceListingEdge() {
    }

    public MarketplaceListingEdge(String cursor, MarketplaceListing node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public MarketplaceListing getNode() {
        return node;
    }
    public void setNode(MarketplaceListing node) {
        this.node = node;
    }

}