package se.umu.cs.githubtypes;

public class ClearLabelsFromLabelableInput {

    private String clientMutationId;
    private String labelableId;

    public ClearLabelsFromLabelableInput() {
    }

    public ClearLabelsFromLabelableInput(String clientMutationId, String labelableId) {
        this.clientMutationId = clientMutationId;
        this.labelableId = labelableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getLabelableId() {
        return labelableId;
    }
    public void setLabelableId(String labelableId) {
        this.labelableId = labelableId;
    }

}