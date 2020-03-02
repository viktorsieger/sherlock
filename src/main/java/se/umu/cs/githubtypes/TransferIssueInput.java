package se.umu.cs.githubtypes;

public class TransferIssueInput {

    private String clientMutationId;
    private String issueId;
    private String repositoryId;

    public TransferIssueInput() {
    }

    public TransferIssueInput(String clientMutationId, String issueId, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.issueId = issueId;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getIssueId() {
        return issueId;
    }
    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}