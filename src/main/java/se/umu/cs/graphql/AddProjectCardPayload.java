package se.umu.cs.graphql;

import java.util.*;

public class AddProjectCardPayload {

    private ProjectCardEdge cardEdge;
    private String clientMutationId;
    private ProjectColumn projectColumn;

    public AddProjectCardPayload() {
    }

    public AddProjectCardPayload(ProjectCardEdge cardEdge, String clientMutationId, ProjectColumn projectColumn) {
        this.cardEdge = cardEdge;
        this.clientMutationId = clientMutationId;
        this.projectColumn = projectColumn;
    }

    public ProjectCardEdge getCardEdge() {
        return cardEdge;
    }
    public void setCardEdge(ProjectCardEdge cardEdge) {
        this.cardEdge = cardEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumn getProjectColumn() {
        return projectColumn;
    }
    public void setProjectColumn(ProjectColumn projectColumn) {
        this.projectColumn = projectColumn;
    }

}