package se.umu.cs.githubtypes;

public class UpdateLabelPayload {

    private String clientMutationId;
    private Label label;

    public UpdateLabelPayload() {
    }

    public UpdateLabelPayload(String clientMutationId, Label label) {
        this.clientMutationId = clientMutationId;
        this.label = label;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Label getLabel() {
        return label;
    }
    public void setLabel(Label label) {
        this.label = label;
    }

}