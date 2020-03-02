package se.umu.cs.githubtypes;

public class Milestone implements Closable, Node, UniformResourceLocatable{

    private Boolean closed;
    private String closedAt;
    private String createdAt;
    private Actor creator;
    private String description;
    private String dueOn;
    private String id;
    private String issuePrioritiesDebug;
    private IssueConnection issues;
    private Integer number;
    private PullRequestConnection pullRequests;
    private Repository repository;
    private String resourcePath;
    private MilestoneState state;
    private String title;
    private String updatedAt;
    private String url;

    public Milestone() {
    }

    public Milestone(Boolean closed, String closedAt, String createdAt, Actor creator, String description, String dueOn, String id, String issuePrioritiesDebug, IssueConnection issues, Integer number, PullRequestConnection pullRequests, Repository repository, String resourcePath, MilestoneState state, String title, String updatedAt, String url) {
        this.closed = closed;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.dueOn = dueOn;
        this.id = id;
        this.issuePrioritiesDebug = issuePrioritiesDebug;
        this.issues = issues;
        this.number = number;
        this.pullRequests = pullRequests;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueOn() {
        return dueOn;
    }
    public void setDueOn(String dueOn) {
        this.dueOn = dueOn;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIssuePrioritiesDebug() {
        return issuePrioritiesDebug;
    }
    public void setIssuePrioritiesDebug(String issuePrioritiesDebug) {
        this.issuePrioritiesDebug = issuePrioritiesDebug;
    }

    public IssueConnection getIssues() {
        return issues;
    }
    public void setIssues(IssueConnection issues) {
        this.issues = issues;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public PullRequestConnection getPullRequests() {
        return pullRequests;
    }
    public void setPullRequests(PullRequestConnection pullRequests) {
        this.pullRequests = pullRequests;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public MilestoneState getState() {
        return state;
    }
    public void setState(MilestoneState state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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