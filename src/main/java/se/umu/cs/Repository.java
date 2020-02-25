package se.umu.cs;

import java.util.Date;
import java.util.List;

public class Repository {

    //private List<Repository> forks;
    private List<Issue> issues;
    private List<Label> labels;
    private List<PullRequest> pullRequests;
    private List<Star> stars;
    //private List<RepositoryVulnerabilityAlert> vulnerabilityAlerts;
    private Date createdAt;
    private boolean hasIssuesEnabled;
    private String id;
    private boolean isArchived;
    private boolean isDisabled;
    private boolean isLocked;
    private boolean isMirror;
    //private boolean isPrivate;
    private boolean isTemplate;
    private License licenseInfo;
    private String name;
    private User owner; // Organizations?
    private Date pushedAt;
    private Date updatedAt;

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<PullRequest> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<PullRequest> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isHasIssuesEnabled() {
        return hasIssuesEnabled;
    }

    public void setHasIssuesEnabled(boolean hasIssuesEnabled) {
        this.hasIssuesEnabled = hasIssuesEnabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isMirror() {
        return isMirror;
    }

    public void setMirror(boolean mirror) {
        isMirror = mirror;
    }

    public boolean isTemplate() {
        return isTemplate;
    }

    public void setTemplate(boolean template) {
        isTemplate = template;
    }

    public License getLicenseInfo() {
        return licenseInfo;
    }

    public void setLicenseInfo(License licenseInfo) {
        this.licenseInfo = licenseInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Date getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(Date pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
