package se.umu.cs.graphql;

import java.util.*;

public class RemoveReactionInput {

    private String clientMutationId;
    private ReactionContent content;
    private String subjectId;

    public RemoveReactionInput() {
    }

    public RemoveReactionInput(String clientMutationId, ReactionContent content, String subjectId) {
        this.clientMutationId = clientMutationId;
        this.content = content;
        this.subjectId = subjectId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ReactionContent getContent() {
        return content;
    }
    public void setContent(ReactionContent content) {
        this.content = content;
    }

    public String getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}