package se.umu.cs.githubtypes;

public class CreateCheckSuiteInput {

    private String clientMutationId;
    private String headSha;
    private String repositoryId;

    public CreateCheckSuiteInput() {
    }

    public CreateCheckSuiteInput(String clientMutationId, String headSha, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.headSha = headSha;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getHeadSha() {
        return headSha;
    }
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}