package se.umu.cs.githubtypes;

public class UpdatePullRequestPayload {

    private Actor actor;
    private String clientMutationId;
    private PullRequest pullRequest;

    public UpdatePullRequestPayload() {
    }

    public UpdatePullRequestPayload(Actor actor, String clientMutationId, PullRequest pullRequest) {
        this.actor = actor;
        this.clientMutationId = clientMutationId;
        this.pullRequest = pullRequest;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

}