package se.umu.cs.graphql;

import java.util.*;

public class TextMatchHighlight {

    private Integer beginIndice;
    private Integer endIndice;
    private String text;

    public TextMatchHighlight() {
    }

    public TextMatchHighlight(Integer beginIndice, Integer endIndice, String text) {
        this.beginIndice = beginIndice;
        this.endIndice = endIndice;
        this.text = text;
    }

    public Integer getBeginIndice() {
        return beginIndice;
    }
    public void setBeginIndice(Integer beginIndice) {
        this.beginIndice = beginIndice;
    }

    public Integer getEndIndice() {
        return endIndice;
    }
    public void setEndIndice(Integer endIndice) {
        this.endIndice = endIndice;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}