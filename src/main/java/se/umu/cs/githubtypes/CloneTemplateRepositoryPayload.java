package se.umu.cs.githubtypes;

public class CloneTemplateRepositoryPayload {

    private String clientMutationId;
    private Repository repository;

    public CloneTemplateRepositoryPayload() {
    }

    public CloneTemplateRepositoryPayload(String clientMutationId, Repository repository) {
        this.clientMutationId = clientMutationId;
        this.repository = repository;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}