package se.umu.cs.githubtypes;

public class MergedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node, UniformResourceLocatable{

    private Actor actor;
    private Commit commit;
    private String createdAt;
    private String id;
    private Ref mergeRef;
    private String mergeRefName;
    private PullRequest pullRequest;
    private String resourcePath;
    private String url;

    public MergedEvent() {
    }

    public MergedEvent(Actor actor, Commit commit, String createdAt, String id, Ref mergeRef, String mergeRefName, PullRequest pullRequest, String resourcePath, String url) {
        this.actor = actor;
        this.commit = commit;
        this.createdAt = createdAt;
        this.id = id;
        this.mergeRef = mergeRef;
        this.mergeRefName = mergeRefName;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Ref getMergeRef() {
        return mergeRef;
    }
    public void setMergeRef(Ref mergeRef) {
        this.mergeRef = mergeRef;
    }

    public String getMergeRefName() {
        return mergeRefName;
    }
    public void setMergeRefName(String mergeRefName) {
        this.mergeRefName = mergeRefName;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
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

}