package se.umu.cs.githubtypes;

public class RerequestCheckSuiteInput {

    private String checkSuiteId;
    private String clientMutationId;
    private String repositoryId;

    public RerequestCheckSuiteInput() {
    }

    public RerequestCheckSuiteInput(String checkSuiteId, String clientMutationId, String repositoryId) {
        this.checkSuiteId = checkSuiteId;
        this.clientMutationId = clientMutationId;
        this.repositoryId = repositoryId;
    }

    public String getCheckSuiteId() {
        return checkSuiteId;
    }
    public void setCheckSuiteId(String checkSuiteId) {
        this.checkSuiteId = checkSuiteId;
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