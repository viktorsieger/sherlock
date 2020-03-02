package se.umu.cs.githubtypes;

public class RemovedFromProjectEvent implements IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private Integer databaseId;
    private String id;
    private Project project;
    private String projectColumnName;

    public RemovedFromProjectEvent() {
    }

    public RemovedFromProjectEvent(Actor actor, String createdAt, Integer databaseId, String id, Project project, String projectColumnName) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.project = project;
        this.projectColumnName = projectColumnName;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
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

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

    public String getProjectColumnName() {
        return projectColumnName;
    }
    public void setProjectColumnName(String projectColumnName) {
        this.projectColumnName = projectColumnName;
    }

}