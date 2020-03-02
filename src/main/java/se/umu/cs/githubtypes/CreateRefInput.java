package se.umu.cs.githubtypes;

public class CreateRefInput {

    private String clientMutationId;
    private String name;
    private String oid;
    private String repositoryId;

    public CreateRefInput() {
    }

    public CreateRefInput(String clientMutationId, String name, String oid, String repositoryId) {
        this.clientMutationId = clientMutationId;
        this.name = name;
        this.oid = oid;
        this.repositoryId = repositoryId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

}