package se.umu.cs.graphql;

import java.util.*;

public class UpdateTeamReviewAssignmentInput {

    private TeamReviewAssignmentAlgorithm algorithm;
    private String clientMutationId;
    private Boolean enabled;
    private Collection<String> excludedTeamMemberIds;
    private String id;
    private Boolean notifyTeam;
    private Integer teamMemberCount;

    public UpdateTeamReviewAssignmentInput() {
    }

    public UpdateTeamReviewAssignmentInput(TeamReviewAssignmentAlgorithm algorithm, String clientMutationId, Boolean enabled, Collection<String> excludedTeamMemberIds, String id, Boolean notifyTeam, Integer teamMemberCount) {
        this.algorithm = algorithm;
        this.clientMutationId = clientMutationId;
        this.enabled = enabled;
        this.excludedTeamMemberIds = excludedTeamMemberIds;
        this.id = id;
        this.notifyTeam = notifyTeam;
        this.teamMemberCount = teamMemberCount;
    }

    public TeamReviewAssignmentAlgorithm getAlgorithm() {
        return algorithm;
    }
    public void setAlgorithm(TeamReviewAssignmentAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Collection<String> getExcludedTeamMemberIds() {
        return excludedTeamMemberIds;
    }
    public void setExcludedTeamMemberIds(Collection<String> excludedTeamMemberIds) {
        this.excludedTeamMemberIds = excludedTeamMemberIds;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getNotifyTeam() {
        return notifyTeam;
    }
    public void setNotifyTeam(Boolean notifyTeam) {
        this.notifyTeam = notifyTeam;
    }

    public Integer getTeamMemberCount() {
        return teamMemberCount;
    }
    public void setTeamMemberCount(Integer teamMemberCount) {
        this.teamMemberCount = teamMemberCount;
    }

}