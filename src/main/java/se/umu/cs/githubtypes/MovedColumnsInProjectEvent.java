package se.umu.cs.githubtypes;

public class MovedColumnsInProjectEvent implements IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private Integer databaseId;
    private String id;
    private String previousProjectColumnName;
    private Project project;
    private ProjectCard projectCard;
    private String projectColumnName;

    public MovedColumnsInProjectEvent() {
    }

    public MovedColumnsInProjectEvent(Actor actor, String createdAt, Integer databaseId, String id, String previousProjectColumnName, Project project, ProjectCard projectCard, String projectColumnName) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.previousProjectColumnName = previousProjectColumnName;
        this.project = project;
        this.projectCard = projectCard;
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

    public String getPreviousProjectColumnName() {
        return previousProjectColumnName;
    }
    public void setPreviousProjectColumnName(String previousProjectColumnName) {
        this.previousProjectColumnName = previousProjectColumnName;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectCard getProjectCard() {
        return projectCard;
    }
    public void setProjectCard(ProjectCard projectCard) {
        this.projectCard = projectCard;
    }

    public String getProjectColumnName() {
        return projectColumnName;
    }
    public void setProjectColumnName(String projectColumnName) {
        this.projectColumnName = projectColumnName;
    }

}