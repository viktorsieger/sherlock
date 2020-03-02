package se.umu.cs.githubtypes;

import java.util.Collection;

public class SearchResultItemEdge {

    private String cursor;
    private SearchResultItem node;
    private Collection<TextMatch> textMatches;

    public SearchResultItemEdge() {
    }

    public SearchResultItemEdge(String cursor, SearchResultItem node, Collection<TextMatch> textMatches) {
        this.cursor = cursor;
        this.node = node;
        this.textMatches = textMatches;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public SearchResultItem getNode() {
        return node;
    }
    public void setNode(SearchResultItem node) {
        this.node = node;
    }

    public Collection<TextMatch> getTextMatches() {
        return textMatches;
    }
    public void setTextMatches(Collection<TextMatch> textMatches) {
        this.textMatches = textMatches;
    }

}