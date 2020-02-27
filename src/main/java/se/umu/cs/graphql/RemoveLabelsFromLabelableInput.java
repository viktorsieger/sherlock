package se.umu.cs.graphql;

import java.util.*;

public class RemoveLabelsFromLabelableInput {

    private String clientMutationId;
    private Collection<String> labelIds;
    private String labelableId;

    public RemoveLabelsFromLabelableInput() {
    }

    public RemoveLabelsFromLabelableInput(String clientMutationId, Collection<String> labelIds, String labelableId) {
        this.clientMutationId = clientMutationId;
        this.labelIds = labelIds;
        this.labelableId = labelableId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<String> getLabelIds() {
        return labelIds;
    }
    public void setLabelIds(Collection<String> labelIds) {
        this.labelIds = labelIds;
    }

    public String getLabelableId() {
        return labelableId;
    }
    public void setLabelableId(String labelableId) {
        this.labelableId = labelableId;
    }

}