package se.umu.cs.graphql;

import java.util.*;

public class Language implements Node{

    private String color;
    private String id;
    private String name;

    public Language() {
    }

    public Language(String color, String id, String name) {
        this.color = color;
        this.id = id;
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}