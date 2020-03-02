package se.umu.cs.githubtypes;

import java.util.Collection;

public class TextMatch {

    private String fragment;
    private Collection<TextMatchHighlight> highlights;
    private String property;

    public TextMatch() {
    }

    public TextMatch(String fragment, Collection<TextMatchHighlight> highlights, String property) {
        this.fragment = fragment;
        this.highlights = highlights;
        this.property = property;
    }

    public String getFragment() {
        return fragment;
    }
    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public Collection<TextMatchHighlight> getHighlights() {
        return highlights;
    }
    public void setHighlights(Collection<TextMatchHighlight> highlights) {
        this.highlights = highlights;
    }

    public String getProperty() {
        return property;
    }
    public void setProperty(String property) {
        this.property = property;
    }

}