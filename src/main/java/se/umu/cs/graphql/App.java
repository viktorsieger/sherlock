package se.umu.cs.graphql;

import java.util.*;

public class App implements PushAllowanceActor, SearchResultItem, Node{

    private String createdAt;
    private Integer databaseId;
    private String description;
    private String id;
    private String logoBackgroundColor;
    private String logoUrl;
    private String name;
    private String slug;
    private String updatedAt;
    private String url;

    public App() {
    }

    public App(String createdAt, Integer databaseId, String description, String id, String logoBackgroundColor, String logoUrl, String name, String slug, String updatedAt, String url) {
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.description = description;
        this.id = id;
        this.logoBackgroundColor = logoBackgroundColor;
        this.logoUrl = logoUrl;
        this.name = name;
        this.slug = slug;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLogoBackgroundColor() {
        return logoBackgroundColor;
    }
    public void setLogoBackgroundColor(String logoBackgroundColor) {
        this.logoBackgroundColor = logoBackgroundColor;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}