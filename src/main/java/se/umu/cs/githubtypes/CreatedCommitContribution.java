package se.umu.cs.githubtypes;

public class CreatedCommitContribution implements Contribution{

    private Integer commitCount;
    private Boolean isRestricted;
    private String occurredAt;
    private Repository repository;
    private String resourcePath;
    private String url;
    private User user;

    public CreatedCommitContribution() {
    }

    public CreatedCommitContribution(Integer commitCount, Boolean isRestricted, String occurredAt, Repository repository, String resourcePath, String url, User user) {
        this.commitCount = commitCount;
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
    }

    public Integer getCommitCount() {
        return commitCount;
    }
    public void setCommitCount(Integer commitCount) {
        this.commitCount = commitCount;
    }

    public Boolean getIsRestricted() {
        return isRestricted;
    }
    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    public String getOccurredAt() {
        return occurredAt;
    }
    public void setOccurredAt(String occurredAt) {
        this.occurredAt = occurredAt;
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

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}