package se.umu.cs.githubtypes;

public class UnmarkIssueAsDuplicateInput {

    private String canonicalId;
    private String clientMutationId;
    private String duplicateId;

    public UnmarkIssueAsDuplicateInput() {
    }

    public UnmarkIssueAsDuplicateInput(String canonicalId, String clientMutationId, String duplicateId) {
        this.canonicalId = canonicalId;
        this.clientMutationId = clientMutationId;
        this.duplicateId = duplicateId;
    }

    public String getCanonicalId() {
        return canonicalId;
    }
    public void setCanonicalId(String canonicalId) {
        this.canonicalId = canonicalId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDuplicateId() {
        return duplicateId;
    }
    public void setDuplicateId(String duplicateId) {
        this.duplicateId = duplicateId;
    }

}