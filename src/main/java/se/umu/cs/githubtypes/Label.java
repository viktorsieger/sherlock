package se.umu.cs.githubtypes;

public class Label implements Node{

    private String color;
    private String createdAt;
    private String description;
    private String id;
    private Boolean isDefault;
    private IssueConnection issues;
    private String name;
    private PullRequestConnection pullRequests;
    private Repository repository;
    private String resourcePath;
    private String updatedAt;
    private String url;

    public Label() {
    }

    public Label(String color, String createdAt, String description, String id, Boolean isDefault, IssueConnection issues, String name, PullRequestConnection pullRequests, Repository repository, String resourcePath, String updatedAt, String url) {
        this.color = color;
        this.createdAt = createdAt;
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.issues = issues;
        this.name = name;
        this.pullRequests = pullRequests;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public Boolean getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public IssueConnection getIssues() {
        return issues;
    }
    public void setIssues(IssueConnection issues) {
        this.issues = issues;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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