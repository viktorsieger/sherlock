package se.umu.cs.githubtypes;

public class JoinedGitHubContribution implements Contribution{

    private Boolean isRestricted;
    private String occurredAt;
    private String resourcePath;
    private String url;
    private User user;

    public JoinedGitHubContribution() {
    }

    public JoinedGitHubContribution(Boolean isRestricted, String occurredAt, String resourcePath, String url, User user) {
        this.isRestricted = isRestricted;
        this.occurredAt = occurredAt;
        this.resourcePath = resourcePath;
        this.url = url;
        this.user = user;
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