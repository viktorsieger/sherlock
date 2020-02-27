package se.umu.cs.graphql;

import java.util.*;

public class AcceptTopicSuggestionInput {

    private String clientMutationId;
    private String name;
    private String repositoryId;

    public AcceptTopicSuggestionInput() {
    }

    public AcceptTopicSuggestionInput(String clientMutationId, String name, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}