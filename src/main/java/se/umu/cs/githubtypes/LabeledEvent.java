package se.umu.cs.githubtypes;

public class LabeledEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private Label label;
    private Labelable labelable;

    public LabeledEvent() {
    }

    public LabeledEvent(Actor actor, String createdAt, String id, Label label, Labelable labelable) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.label = label;
        this.labelable = labelable;
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

    public Label getLabel() {
        return label;
    }
    public void setLabel(Label label) {
        this.label = label;
    }

    public Labelable getLabelable() {
        return labelable;
    }
    public void setLabelable(Labelable labelable) {
        this.labelable = labelable;
    }

}