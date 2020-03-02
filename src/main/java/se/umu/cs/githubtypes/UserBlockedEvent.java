package se.umu.cs.githubtypes;

public class UserBlockedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private UserBlockDuration blockDuration;
    private String createdAt;
    private String id;
    private User subject;

    public UserBlockedEvent() {
    }

    public UserBlockedEvent(Actor actor, UserBlockDuration blockDuration, String createdAt, String id, User subject) {
        this.actor = actor;
        this.blockDuration = blockDuration;
        this.createdAt = createdAt;
        this.id = id;
        this.subject = subject;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public UserBlockDuration getBlockDuration() {
        return blockDuration;
    }
    public void setBlockDuration(UserBlockDuration blockDuration) {
        this.blockDuration = blockDuration;
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

    public User getSubject() {
        return subject;
    }
    public void setSubject(User subject) {
        this.subject = subject;
    }

}