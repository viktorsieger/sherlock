package se.umu.cs.githubtypes;

public class UnlinkRepositoryFromProjectInput {

    private String clientMutationId;
    private String projectId;
    private String repositoryId;

    public UnlinkRepositoryFromProjectInput() {
    }

    public UnlinkRepositoryFromProjectInput(String clientMutationId, String projectId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.projectId = projectId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getProjectId() {
        return projectId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}