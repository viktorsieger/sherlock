package se.umu.cs.graphql;

import java.util.*;

public class ReferencedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private Commit commit;
    private Repository commitRepository;
    private String createdAt;
    private String id;
    private Boolean isCrossRepository;
    private Boolean isDirectReference;
    private ReferencedSubject subject;

    public ReferencedEvent() {
    }

    public ReferencedEvent(Actor actor, Commit commit, Repository commitRepository, String createdAt, String id, Boolean isCrossRepository, Boolean isDirectReference, ReferencedSubject subject) {
        this.actor = actor;
        this.commit = commit;
        this.commitRepository = commitRepository;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.isDirectReference = isDirectReference;
        this.subject = subject;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Repository getCommitRepository() {
        return commitRepository;
    }
    public void setCommitRepository(Repository commitRepository) {
        this.commitRepository = commitRepository;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsCrossRepository() {
        return isCrossRepository;
    }
    public void setIsCrossRepository(Boolean isCrossRepository) {
        this.isCrossRepository = isCrossRepository;
    }

    public Boolean getIsDirectReference() {
        return isDirectReference;
    }
    public void setIsDirectReference(Boolean isDirectReference) {
        this.isDirectReference = isDirectReference;
    }

    public ReferencedSubject getSubject() {
        return subject;
    }
    public void setSubject(ReferencedSubject subject) {
        this.subject = subject;
    }

}