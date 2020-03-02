package se.umu.cs.githubtypes;

public class ProjectCard implements Node{

    private ProjectColumn column;
    private ProjectCardItem content;
    private String createdAt;
    private Actor creator;
    private Integer databaseId;
    private String id;
    private Boolean isArchived;
    private String note;
    private Project project;
    private String resourcePath;
    private ProjectCardState state;
    private String updatedAt;
    private String url;

    public ProjectCard() {
    }

    public ProjectCard(ProjectColumn column, ProjectCardItem content, String createdAt, Actor creator, Integer databaseId, String id, Boolean isArchived, String note, Project project, String resourcePath, ProjectCardState state, String updatedAt, String url) {
        this.column = column;
        this.content = content;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.id = id;
        this.isArchived = isArchived;
        this.note = note;
        this.project = project;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public ProjectColumn getColumn() {
        return column;
    }
    public void setColumn(ProjectColumn column) {
        this.column = column;
    }

    public ProjectCardItem getContent() {
        return content;
    }
    public void setContent(ProjectCardItem content) {
        this.content = content;
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

    public Boolean getIsArchived() {
        return isArchived;
    }
    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ProjectCardState getState() {
        return state;
    }
    public void setState(ProjectCardState state) {
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

}