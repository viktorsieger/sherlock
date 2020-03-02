package se.umu.cs.githubtypes;

public class CloneTemplateRepositoryInput {

    private String clientMutationId;
    private String description;
    private String name;
    private String ownerId;
    private String repositoryId;
    private RepositoryVisibility visibility;

    public CloneTemplateRepositoryInput() {
    }

    public CloneTemplateRepositoryInput(String clientMutationId, String description, String name, String ownerId, String repositoryId, RepositoryVisibility visibility) {
        this.clientMutationId = clientMutationId;
        this.description = description;
        this.name = name;
        this.ownerId = ownerId;
        this.repositoryId = repositoryId;
        this.visibility = visibility;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryVisibility getVisibility() {
        return visibility;
    }
    public void setVisibility(RepositoryVisibility visibility) {
        this.visibility = visibility;
    }

}