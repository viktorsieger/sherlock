package se.umu.cs.githubtypes;

public class BaseRefForcePushedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private Commit afterCommit;
    private Commit beforeCommit;
    private String createdAt;
    private String id;
    private PullRequest pullRequest;
    private Ref ref;

    public BaseRefForcePushedEvent() {
    }

    public BaseRefForcePushedEvent(Actor actor, Commit afterCommit, Commit beforeCommit, String createdAt, String id, PullRequest pullRequest, Ref ref) {
        this.actor = actor;
        this.afterCommit = afterCommit;
        this.beforeCommit = beforeCommit;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
        this.ref = ref;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Commit getAfterCommit() {
        return afterCommit;
    }
    public void setAfterCommit(Commit afterCommit) {
        this.afterCommit = afterCommit;
    }

    public Commit getBeforeCommit() {
        return beforeCommit;
    }
    public void setBeforeCommit(Commit beforeCommit) {
        this.beforeCommit = beforeCommit;
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

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public Ref getRef() {
        return ref;
    }
    public void setRef(Ref ref) {
        this.ref = ref;
    }

}