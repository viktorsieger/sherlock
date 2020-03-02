package se.umu.cs.githubtypes;

public class UnmarkedAsDuplicateEvent implements IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;

    public UnmarkedAsDuplicateEvent() {
    }

    public UnmarkedAsDuplicateEvent(Actor actor, String createdAt, String id) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
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

}