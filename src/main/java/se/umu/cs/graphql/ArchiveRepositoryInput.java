package se.umu.cs.graphql;

import java.util.*;

public class ArchiveRepositoryInput {

    private String clientMutationId;
    private String repositoryId;

    public ArchiveRepositoryInput() {
    }

    public ArchiveRepositoryInput(String clientMutationId, String repositoryId) {
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