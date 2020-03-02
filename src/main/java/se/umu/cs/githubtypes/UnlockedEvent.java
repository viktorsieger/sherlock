package se.umu.cs.githubtypes;

public class UnlockedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private Lockable lockable;

    public UnlockedEvent() {
    }

    public UnlockedEvent(Actor actor, String createdAt, String id, Lockable lockable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.lockable = lockable;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Lockable getLockable() {
        return lockable;
    }
    public void setLockable(Lockable lockable) {
        this.lockable = lockable;
    }

}