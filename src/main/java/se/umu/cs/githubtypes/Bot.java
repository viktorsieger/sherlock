package se.umu.cs.githubtypes;

public class Bot implements Assignee, AuditEntryActor, Actor, Node, UniformResourceLocatable{

    private String avatarUrl;
    private String createdAt;
    private Integer databaseId;
    private String id;
    private String login;
    private String resourcePath;
    private String updatedAt;
    private String url;

    public Bot() {
    }

    public Bot(String avatarUrl, String createdAt, Integer databaseId, String id, String login, String resourcePath, String updatedAt, String url) {
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.login = login;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
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