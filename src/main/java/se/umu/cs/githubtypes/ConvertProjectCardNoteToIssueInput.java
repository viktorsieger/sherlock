package se.umu.cs.githubtypes;

public class ConvertProjectCardNoteToIssueInput {

    private String body;
    private String clientMutationId;
    private String projectCardId;
    private String repositoryId;
    private String title;

    public ConvertProjectCardNoteToIssueInput() {
    }

    public ConvertProjectCardNoteToIssueInput(String body, String clientMutationId, String projectCardId, String repositoryId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.projectCardId = projectCardId;
        this.repositoryId = repositoryId;
        this.title = title;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getProjectCardId() {
        return projectCardId;
    }
    public void setProjectCardId(String projectCardId) {
        this.projectCardId = projectCardId;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}