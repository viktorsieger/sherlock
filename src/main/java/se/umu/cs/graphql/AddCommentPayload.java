package se.umu.cs.graphql;

import java.util.*;

public class AddCommentPayload {

    private String clientMutationId;
    private IssueCommentEdge commentEdge;
    private Node subject;
    private IssueTimelineItemEdge timelineEdge;

    public AddCommentPayload() {
    }

    public AddCommentPayload(String clientMutationId, IssueCommentEdge commentEdge, Node subject, IssueTimelineItemEdge timelineEdge) {
        this.clientMutationId = clientMutationId;
        this.commentEdge = commentEdge;
        this.subject = subject;
        this.timelineEdge = timelineEdge;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public IssueCommentEdge getCommentEdge() {
        return commentEdge;
    }
    public void setCommentEdge(IssueCommentEdge commentEdge) {
        this.commentEdge = commentEdge;
    }

    public Node getSubject() {
        return subject;
    }
    public void setSubject(Node subject) {
        this.subject = subject;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return timelineEdge;
    }
    public void setTimelineEdge(IssueTimelineItemEdge timelineEdge) {
        this.timelineEdge = timelineEdge;
    }

}