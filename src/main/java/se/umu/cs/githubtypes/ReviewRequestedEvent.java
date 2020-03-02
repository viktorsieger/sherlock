package se.umu.cs.githubtypes;

public class ReviewRequestedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private PullRequest pullRequest;
    private RequestedReviewer requestedReviewer;

    public ReviewRequestedEvent() {
    }

    public ReviewRequestedEvent(Actor actor, String createdAt, String id, PullRequest pullRequest, RequestedReviewer requestedReviewer) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.pullRequest = pullRequest;
        this.requestedReviewer = requestedReviewer;
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

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public RequestedReviewer getRequestedReviewer() {
        return requestedReviewer;
    }
    public void setRequestedReviewer(RequestedReviewer requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

}