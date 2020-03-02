package se.umu.cs.githubtypes;

import java.util.Collection;

public class AddPullRequestReviewInput {

    private String body;
    private String clientMutationId;
    private Collection<DraftPullRequestReviewComment> comments;
    private String commitOID;
    private PullRequestReviewEvent event;
    private String pullRequestId;
    private Collection<DraftPullRequestReviewThread> threads;

    public AddPullRequestReviewInput() {
    }

    public AddPullRequestReviewInput(String body, String clientMutationId, Collection<DraftPullRequestReviewComment> comments, String commitOID, PullRequestReviewEvent event, String pullRequestId, Collection<DraftPullRequestReviewThread> threads) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.comments = comments;
        this.commitOID = commitOID;
        this.event = event;
        this.pullRequestId = pullRequestId;
        this.threads = threads;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<DraftPullRequestReviewComment> getComments() {
        return comments;
    }
    public void setComments(Collection<DraftPullRequestReviewComment> comments) {
        this.comments = comments;
    }

    public String getCommitOID() {
        return commitOID;
    }
    public void setCommitOID(String commitOID) {
        this.commitOID = commitOID;
    }

    public PullRequestReviewEvent getEvent() {
        return event;
    }
    public void setEvent(PullRequestReviewEvent event) {
        this.event = event;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public Collection<DraftPullRequestReviewThread> getThreads() {
        return threads;
    }
    public void setThreads(Collection<DraftPullRequestReviewThread> threads) {
        this.threads = threads;
    }

}