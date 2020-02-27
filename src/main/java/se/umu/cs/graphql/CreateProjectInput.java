package se.umu.cs.graphql;

import java.util.*;

public class CreateProjectInput {

    private String body;
    private String clientMutationId;
    private String name;
    private String ownerId;
    private Collection<String> repositoryIds;
    private ProjectTemplate template;

    public CreateProjectInput() {
    }

    public CreateProjectInput(String body, String clientMutationId, String name, String ownerId, Collection<String> repositoryIds, ProjectTemplate template) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.ownerId = ownerId;
        this.repositoryIds = repositoryIds;
        this.template = template;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
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

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Collection<String> getRepositoryIds() {
        return repositoryIds;
    }
    public void setRepositoryIds(Collection<String> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public ProjectTemplate getTemplate() {
        return template;
    }
    public void setTemplate(ProjectTemplate template) {
        this.template = template;
    }

}