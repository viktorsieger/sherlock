package se.umu.cs.githubtypes;

public class CreateCheckSuitePayload {

    private CheckSuite checkSuite;
    private String clientMutationId;

    public CreateCheckSuitePayload() {
    }

    public CreateCheckSuitePayload(CheckSuite checkSuite, String clientMutationId) {
        this.checkSuite = checkSuite;
        this.clientMutationId = clientMutationId;
    }

    public CheckSuite getCheckSuite() {
        return checkSuite;
    }
    public void setCheckSuite(CheckSuite checkSuite) {
        this.checkSuite = checkSuite;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}