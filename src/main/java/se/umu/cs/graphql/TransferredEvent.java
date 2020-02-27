package se.umu.cs.graphql;

import java.util.*;

public class TransferredEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private Repository fromRepository;
    private String id;
    private Issue issue;

    public TransferredEvent() {
    }

    public TransferredEvent(Actor actor, String createdAt, Repository fromRepository, String id, Issue issue) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.fromRepository = fromRepository;
        this.id = id;
        this.issue = issue;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Repository getFromRepository() {
        return fromRepository;
    }
    public void setFromRepository(Repository fromRepository) {
        this.fromRepository = fromRepository;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Issue getIssue() {
        return issue;
    }
    public void setIssue(Issue issue) {
        this.issue = issue;
    }

}