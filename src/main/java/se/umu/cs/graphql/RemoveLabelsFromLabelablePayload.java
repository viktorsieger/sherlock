package se.umu.cs.graphql;

import java.util.*;

public class RemoveLabelsFromLabelablePayload {

    private String clientMutationId;
    private Labelable labelable;

    public RemoveLabelsFromLabelablePayload() {
    }

    public RemoveLabelsFromLabelablePayload(String clientMutationId, Labelable labelable) {
        this.clientMutationId = clientMutationId;
        this.labelable = labelable;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Labelable getLabelable() {
        return labelable;
    }
    public void setLabelable(Labelable labelable) {
        this.labelable = labelable;
    }

}