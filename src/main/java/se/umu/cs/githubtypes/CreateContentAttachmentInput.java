package se.umu.cs.githubtypes;

public class CreateContentAttachmentInput {

    private String body;
    private String clientMutationId;
    private String contentReferenceId;
    private String title;

    public CreateContentAttachmentInput() {
    }

    public CreateContentAttachmentInput(String body, String clientMutationId, String contentReferenceId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.contentReferenceId = contentReferenceId;
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

    public String getContentReferenceId() {
        return contentReferenceId;
    }
    public void setContentReferenceId(String contentReferenceId) {
        this.contentReferenceId = contentReferenceId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}