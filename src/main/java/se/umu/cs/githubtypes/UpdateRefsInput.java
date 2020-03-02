package se.umu.cs.githubtypes;

import java.util.Collection;

public class UpdateRefsInput {

    private String clientMutationId;
    private Collection<RefUpdate> refUpdates;
    private String repositoryId;

    public UpdateRefsInput() {
    }

    public UpdateRefsInput(String clientMutationId, Collection<RefUpdate> refUpdates, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.refUpdates = refUpdates;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Collection<RefUpdate> getRefUpdates() {
        return refUpdates;
    }
    public void setRefUpdates(Collection<RefUpdate> refUpdates) {
        this.refUpdates = refUpdates;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}