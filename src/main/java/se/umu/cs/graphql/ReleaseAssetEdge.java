package se.umu.cs.graphql;

import java.util.*;

public class ReleaseAssetEdge {

    private String cursor;
    private ReleaseAsset node;

    public ReleaseAssetEdge() {
    }

    public ReleaseAssetEdge(String cursor, ReleaseAsset node) {
        this.cursor = cursor;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ReleaseAsset getNode() {
        return node;
    }
    public void setNode(ReleaseAsset node) {
        this.node = node;
    }

}