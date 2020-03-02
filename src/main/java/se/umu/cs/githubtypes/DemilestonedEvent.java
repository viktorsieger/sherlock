package se.umu.cs.githubtypes;

public class DemilestonedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private String milestoneTitle;
    private MilestoneItem subject;

    public DemilestonedEvent() {
    }

    public DemilestonedEvent(Actor actor, String createdAt, String id, String milestoneTitle, MilestoneItem subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.milestoneTitle = milestoneTitle;
        this.subject = subject;
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

    public String getMilestoneTitle() {
        return milestoneTitle;
    }
    public void setMilestoneTitle(String milestoneTitle) {
        this.milestoneTitle = milestoneTitle;
    }

    public MilestoneItem getSubject() {
        return subject;
    }
    public void setSubject(MilestoneItem subject) {
        this.subject = subject;
    }

}