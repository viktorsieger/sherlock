package se.umu.cs.githubtypes;

import java.util.Collection;

public class RemoveAssigneesFromAssignableInput {

    private String assignableId;
    private Collection<String> assigneeIds;
    private String clientMutationId;

    public RemoveAssigneesFromAssignableInput() {
    }

    public RemoveAssigneesFromAssignableInput(String assignableId, Collection<String> assigneeIds, String clientMutationId) {
        this.assignableId = assignableId;
        this.assigneeIds = assigneeIds;
        this.clientMutationId = clientMutationId;
    }

    public String getAssignableId() {
        return assignableId;
    }
    public void setAssignableId(String assignableId) {
        this.assignableId = assignableId;
    }

    public Collection<String> getAssigneeIds() {
        return assigneeIds;
    }
    public void setAssigneeIds(Collection<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

}