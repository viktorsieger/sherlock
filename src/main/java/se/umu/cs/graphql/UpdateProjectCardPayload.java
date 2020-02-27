package se.umu.cs.graphql;

import java.util.*;

public class UpdateProjectCardPayload {

    private String clientMutationId;
    private ProjectCard projectCard;

    public UpdateProjectCardPayload() {
    }

    public UpdateProjectCardPayload(String clientMutationId, ProjectCard projectCard) {
        this.clientMutationId = clientMutationId;
        this.projectCard = projectCard;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectCard getProjectCard() {
        return projectCard;
    }
    public void setProjectCard(ProjectCard projectCard) {
        this.projectCard = projectCard;
    }

}