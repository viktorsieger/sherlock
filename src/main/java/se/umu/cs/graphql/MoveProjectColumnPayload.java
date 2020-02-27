package se.umu.cs.graphql;

import java.util.*;

public class MoveProjectColumnPayload {

    private String clientMutationId;
    private ProjectColumnEdge columnEdge;

    public MoveProjectColumnPayload() {
    }

    public MoveProjectColumnPayload(String clientMutationId, ProjectColumnEdge columnEdge) {
        this.clientMutationId = clientMutationId;
        this.columnEdge = columnEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ProjectColumnEdge getColumnEdge() {
        return columnEdge;
    }
    public void setColumnEdge(ProjectColumnEdge columnEdge) {
        this.columnEdge = columnEdge;
    }

}