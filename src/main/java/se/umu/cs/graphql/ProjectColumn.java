package se.umu.cs.graphql;

import java.util.*;

public class ProjectColumn implements Node{

    private ProjectCardConnection cards;
    private String createdAt;
    private Integer databaseId;
    private String id;
    private String name;
    private Project project;
    private ProjectColumnPurpose purpose;
    private String resourcePath;
    private String updatedAt;
    private String url;

    public ProjectColumn() {
    }

    public ProjectColumn(ProjectCardConnection cards, String createdAt, Integer databaseId, String id, String name, Project project, ProjectColumnPurpose purpose, String resourcePath, String updatedAt, String url) {
        this.cards = cards;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.name = name;
        this.project = project;
        this.purpose = purpose;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public ProjectCardConnection getCards() {
        return cards;
    }
    public void setCards(ProjectCardConnection cards) {
        this.cards = cards;
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

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectColumnPurpose getPurpose() {
        return purpose;
    }
    public void setPurpose(ProjectColumnPurpose purpose) {
        this.purpose = purpose;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
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