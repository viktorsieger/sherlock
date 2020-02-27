package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseRepositoryInfo implements Node{

    private String id;
    private Boolean isPrivate;
    private String name;
    private String nameWithOwner;

    public EnterpriseRepositoryInfo() {
    }

    public EnterpriseRepositoryInfo(String id, Boolean isPrivate, String name, String nameWithOwner) {
        this.id = id;
        this.isPrivate = isPrivate;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }
    public void setNameWithOwner(String nameWithOwner) {
        this.nameWithOwner = nameWithOwner;
    }

}