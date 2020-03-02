package se.umu.cs.githubtypes;

public class StatusContext implements Node{

    private String avatarUrl;
    private Commit commit;
    private String context;
    private String createdAt;
    private Actor creator;
    private String description;
    private String id;
    private StatusState state;
    private String targetUrl;

    public StatusContext() {
    }

    public StatusContext(String avatarUrl, Commit commit, String context, String createdAt, Actor creator, String description, String id, StatusState state, String targetUrl) {
        this.avatarUrl = avatarUrl;
        this.commit = commit;
        this.context = context;
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.id = id;
        this.state = state;
        this.targetUrl = targetUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public StatusState getState() {
        return state;
    }
    public void setState(StatusState state) {
        this.state = state;
    }

    public String getTargetUrl() {
        return targetUrl;
    }
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

}