package se.umu.cs.githubtypes;

public class SubscribedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private Subscribable subscribable;

    public SubscribedEvent() {
    }

    public SubscribedEvent(Actor actor, String createdAt, String id, Subscribable subscribable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.subscribable = subscribable;
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

    public Subscribable getSubscribable() {
        return subscribable;
    }
    public void setSubscribable(Subscribable subscribable) {
        this.subscribable = subscribable;
    }

}