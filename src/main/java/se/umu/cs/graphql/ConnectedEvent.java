package se.umu.cs.graphql;

import java.util.*;

public class ConnectedEvent implements IssueTimelineItems, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String id;
    private Boolean isCrossRepository;
    private ReferencedSubject source;
    private ReferencedSubject subject;

    public ConnectedEvent() {
    }

    public ConnectedEvent(Actor actor, String createdAt, String id, Boolean isCrossRepository, ReferencedSubject source, ReferencedSubject subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.source = source;
        this.subject = subject;
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

    public ReferencedSubject getSource() {
        return source;
    }
    public void setSource(ReferencedSubject source) {
        this.source = source;
    }

    public ReferencedSubject getSubject() {
        return subject;
    }
    public void setSubject(ReferencedSubject subject) {
        this.subject = subject;
    }

}