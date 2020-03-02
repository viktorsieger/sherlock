package se.umu.cs.githubtypes;

public class Project implements Closable, Node, Updatable{

    private String body;
    private String bodyHTML;
    private Boolean closed;
    private String closedAt;
    private ProjectColumnConnection columns;
    private String createdAt;
    private Actor creator;
    private Integer databaseId;
    private String id;
    private String name;
    private Integer number;
    private ProjectOwner owner;
    private ProjectCardConnection pendingCards;
    private String resourcePath;
    private ProjectState state;
    private String updatedAt;
    private String url;
    private Boolean viewerCanUpdate;

    public Project() {
    }

    public Project(String body, String bodyHTML, Boolean closed, String closedAt, ProjectColumnConnection columns, String createdAt, Actor creator, Integer databaseId, String id, String name, Integer number, ProjectOwner owner, ProjectCardConnection pendingCards, String resourcePath, ProjectState state, String updatedAt, String url, Boolean viewerCanUpdate) {
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.closed = closed;
        this.closedAt = closedAt;
        this.columns = columns;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.id = id;
        this.name = name;
        this.number = number;
        this.owner = owner;
        this.pendingCards = pendingCards;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanUpdate = viewerCanUpdate;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }
    public void setBodyHTML(String bodyHTML) {
        this.bodyHTML = bodyHTML;
    }

    public Boolean getClosed() {
        return closed;
    }
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public ProjectColumnConnection getColumns() {
        return columns;
    }
    public void setColumns(ProjectColumnConnection columns) {
        this.columns = columns;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Actor getCreator() {
        return creator;
    }
    public void setCreator(Actor creator) {
        this.creator = creator;
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

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public ProjectOwner getOwner() {
        return owner;
    }
    public void setOwner(ProjectOwner owner) {
        this.owner = owner;
    }

    public ProjectCardConnection getPendingCards() {
        return pendingCards;
    }
    public void setPendingCards(ProjectCardConnection pendingCards) {
        this.pendingCards = pendingCards;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ProjectState getState() {
        return state;
    }
    public void setState(ProjectState state) {
        this.state = state;
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

    public Boolean getViewerCanUpdate() {
        return viewerCanUpdate;
    }
    public void setViewerCanUpdate(Boolean viewerCanUpdate) {
        this.viewerCanUpdate = viewerCanUpdate;
    }

}