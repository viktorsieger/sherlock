package se.umu.cs.githubtypes;

public class LockedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private LockReason lockReason;
    private Lockable lockable;

    public LockedEvent() {
    }

    public LockedEvent(Actor actor, String createdAt, String id, LockReason lockReason, Lockable lockable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.lockReason = lockReason;
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

    public LockReason getLockReason() {
        return lockReason;
    }
    public void setLockReason(LockReason lockReason) {
        this.lockReason = lockReason;
    }

    public Lockable getLockable() {
        return lockable;
    }
    public void setLockable(Lockable lockable) {
        this.lockable = lockable;
    }

}