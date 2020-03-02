package se.umu.cs.githubtypes;

public class UnassignedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private Assignable assignable;
    private Assignee assignee;
    private String createdAt;
    private String id;
    private User user;

    public UnassignedEvent() {
    }

    public UnassignedEvent(Actor actor, Assignable assignable, Assignee assignee, String createdAt, String id, User user) {
        this.actor = actor;
        this.assignable = assignable;
        this.assignee = assignee;
        this.createdAt = createdAt;
        this.id = id;
        this.user = user;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Assignable getAssignable() {
        return assignable;
    }
    public void setAssignable(Assignable assignable) {
        this.assignable = assignable;
    }

    public Assignee getAssignee() {
        return assignee;
    }
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
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

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

}