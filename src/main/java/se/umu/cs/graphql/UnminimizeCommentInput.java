package se.umu.cs.graphql;

import java.util.*;

public class UnminimizeCommentInput {

    private String clientMutationId;
    private String subjectId;

    public UnminimizeCommentInput() {
    }

    public UnminimizeCommentInput(String clientMutationId, String subjectId) {
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
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