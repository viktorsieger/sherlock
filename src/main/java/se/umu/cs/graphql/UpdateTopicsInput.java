package se.umu.cs.graphql;

import java.util.*;

public class UpdateTopicsInput {

    private String clientMutationId;
    private String repositoryId;
    private Collection<String> topicNames;

    public UpdateTopicsInput() {
    }

    public UpdateTopicsInput(String clientMutationId, String repositoryId, Collection<String> topicNames) {
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
        this.topicNames = topicNames;
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

    public Collection<String> getTopicNames() {
        return topicNames;
    }
    public void setTopicNames(Collection<String> topicNames) {
        this.topicNames = topicNames;
    }

}