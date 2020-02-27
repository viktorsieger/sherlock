package se.umu.cs.graphql;

import java.util.*;

public class ReactionGroup {

    private ReactionContent content;
    private String createdAt;
    private Reactable subject;
    private ReactingUserConnection users;
    private Boolean viewerHasReacted;

    public ReactionGroup() {
    }

    public ReactionGroup(ReactionContent content, String createdAt, Reactable subject, ReactingUserConnection users, Boolean viewerHasReacted) {
        this.content = content;
        this.createdAt = createdAt;
        this.subject = subject;
        this.users = users;
        this.viewerHasReacted = viewerHasReacted;
    }

    public ReactionContent getContent() {
        return content;
    }
    public void setContent(ReactionContent content) {
        this.content = content;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Reactable getSubject() {
        return subject;
    }
    public void setSubject(Reactable subject) {
        this.subject = subject;
    }

    public ReactingUserConnection getUsers() {
        return users;
    }
    public void setUsers(ReactingUserConnection users) {
        this.users = users;
    }

    public Boolean getViewerHasReacted() {
        return viewerHasReacted;
    }
    public void setViewerHasReacted(Boolean viewerHasReacted) {
        this.viewerHasReacted = viewerHasReacted;
    }

}