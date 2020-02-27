package se.umu.cs.graphql;

import java.util.*;

public class UnarchiveRepositoryInput {

    private String clientMutationId;
    private String repositoryId;

    public UnarchiveRepositoryInput() {
    }

    public UnarchiveRepositoryInput(String clientMutationId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}