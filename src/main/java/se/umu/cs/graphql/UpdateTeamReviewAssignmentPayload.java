package se.umu.cs.graphql;

import java.util.*;

public class UpdateTeamReviewAssignmentPayload {

    private String clientMutationId;
    private Team team;

    public UpdateTeamReviewAssignmentPayload() {
    }

    public UpdateTeamReviewAssignmentPayload(String clientMutationId, Team team) {
        this.clientMutationId = clientMutationId;
        this.team = team;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

}