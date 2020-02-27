package se.umu.cs.graphql;

import java.util.*;

public class UpdateTopicsPayload {

    private String clientMutationId;
    private Collection<String> invalidTopicNames;
    private Repository repository;

    public UpdateTopicsPayload() {
    }

    public UpdateTopicsPayload(String clientMutationId, Collection<String> invalidTopicNames, Repository repository) {
        this.clientMutationId = clientMutationId;
        this.invalidTopicNames = invalidTopicNames;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<String> getInvalidTopicNames() {
        return invalidTopicNames;
    }
    public void setInvalidTopicNames(Collection<String> invalidTopicNames) {
        this.invalidTopicNames = invalidTopicNames;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}