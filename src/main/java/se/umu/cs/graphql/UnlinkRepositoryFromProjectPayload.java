package se.umu.cs.graphql;

import java.util.*;

public class UnlinkRepositoryFromProjectPayload {

    private String clientMutationId;
    private Project project;
    private Repository repository;

    public UnlinkRepositoryFromProjectPayload() {
    }

    public UnlinkRepositoryFromProjectPayload(String clientMutationId, Project project, Repository repository) {
        this.clientMutationId = clientMutationId;
        this.project = project;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}