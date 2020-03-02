package se.umu.cs.githubtypes;

public class ReviewDismissedEvent implements PullRequestTimelineItem, PullRequestTimelineItems, Node, UniformResourceLocatable{

    private Actor actor;
    private String createdAt;
    private Integer databaseId;
    private String dismissalMessage;
    private String dismissalMessageHTML;
    private String id;
    private PullRequestReviewState previousReviewState;
    private PullRequest pullRequest;
    private PullRequestCommit pullRequestCommit;
    private String resourcePath;
    private PullRequestReview review;
    private String url;

    public ReviewDismissedEvent() {
    }

    public ReviewDismissedEvent(Actor actor, String createdAt, Integer databaseId, String dismissalMessage, String dismissalMessageHTML, String id, PullRequestReviewState previousReviewState, PullRequest pullRequest, PullRequestCommit pullRequestCommit, String resourcePath, PullRequestReview review, String url) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.dismissalMessage = dismissalMessage;
        this.dismissalMessageHTML = dismissalMessageHTML;
        this.id = id;
        this.previousReviewState = previousReviewState;
        this.pullRequest = pullRequest;
        this.pullRequestCommit = pullRequestCommit;
        this.resourcePath = resourcePath;
        this.review = review;
        this.url = url;
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

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDismissalMessage() {
        return dismissalMessage;
    }
    public void setDismissalMessage(String dismissalMessage) {
        this.dismissalMessage = dismissalMessage;
    }

    public String getDismissalMessageHTML() {
        return dismissalMessageHTML;
    }
    public void setDismissalMessageHTML(String dismissalMessageHTML) {
        this.dismissalMessageHTML = dismissalMessageHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequestReviewState getPreviousReviewState() {
        return previousReviewState;
    }
    public void setPreviousReviewState(PullRequestReviewState previousReviewState) {
        this.previousReviewState = previousReviewState;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PullRequestCommit getPullRequestCommit() {
        return pullRequestCommit;
    }
    public void setPullRequestCommit(PullRequestCommit pullRequestCommit) {
        this.pullRequestCommit = pullRequestCommit;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public PullRequestReview getReview() {
        return review;
    }
    public void setReview(PullRequestReview review) {
        this.review = review;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}