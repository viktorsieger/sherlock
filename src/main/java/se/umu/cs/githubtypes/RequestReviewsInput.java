package se.umu.cs.githubtypes;

import java.util.Collection;

public class RequestReviewsInput {

    private String clientMutationId;
    private String pullRequestId;
    private Collection<String> teamIds;
    private Boolean union;
    private Collection<String> userIds;

    public RequestReviewsInput() {
    }

    public RequestReviewsInput(String clientMutationId, String pullRequestId, Collection<String> teamIds, Boolean union, Collection<String> userIds) {
        this.clientMutationId = clientMutationId;
        this.pullRequestId = pullRequestId;
        this.teamIds = teamIds;
        this.union = union;
        this.userIds = userIds;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getPullRequestId() {
        return pullRequestId;
    }
    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public Collection<String> getTeamIds() {
        return teamIds;
    }
    public void setTeamIds(Collection<String> teamIds) {
        this.teamIds = teamIds;
    }

    public Boolean getUnion() {
        return union;
    }
    public void setUnion(Boolean union) {
        this.union = union;
    }

    public Collection<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(Collection<String> userIds) {
        this.userIds = userIds;
    }

}