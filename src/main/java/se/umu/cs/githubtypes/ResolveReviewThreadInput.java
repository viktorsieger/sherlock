package se.umu.cs.githubtypes;

public class ResolveReviewThreadInput {

    private String clientMutationId;
    private String threadId;

    public ResolveReviewThreadInput() {
    }

    public ResolveReviewThreadInput(String clientMutationId, String threadId) {
        this.clientMutationId = clientMutationId;
        this.threadId = threadId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getThreadId() {
        return threadId;
    }
    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

}