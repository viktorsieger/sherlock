package se.umu.cs.githubtypes;

public class AddCommentInput {

    private String body;
    private String clientMutationId;
    private String subjectId;

    public AddCommentInput() {
    }

    public AddCommentInput(String body, String clientMutationId, String subjectId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
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

    public String getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}