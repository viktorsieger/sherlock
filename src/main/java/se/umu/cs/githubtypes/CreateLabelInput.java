package se.umu.cs.githubtypes;

public class CreateLabelInput {

    private String clientMutationId;
    private String color;
    private String description;
    private String name;
    private String repositoryId;

    public CreateLabelInput() {
    }

    public CreateLabelInput(String clientMutationId, String color, String description, String name, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.color = color;
        this.description = description;
        this.name = name;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}