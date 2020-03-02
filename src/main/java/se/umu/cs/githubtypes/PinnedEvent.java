package se.umu.cs.githubtypes;

public class PinnedEvent implements IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private Issue issue;

    public PinnedEvent() {
    }

    public PinnedEvent(Actor actor, String createdAt, String id, Issue issue) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.issue = issue;
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

    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

}