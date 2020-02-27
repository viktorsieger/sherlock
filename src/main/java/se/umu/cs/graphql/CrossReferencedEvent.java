package se.umu.cs.graphql;

import java.util.*;

public class CrossReferencedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node, UniformResourceLocatable{

    private Actor actor;
    private String createdAt;
    private String id;
    private Boolean isCrossRepository;
    private String referencedAt;
    private String resourcePath;
    private ReferencedSubject source;
    private ReferencedSubject target;
    private String url;
    private Boolean willCloseTarget;

    public CrossReferencedEvent() {
    }

    public CrossReferencedEvent(Actor actor, String createdAt, String id, Boolean isCrossRepository, String referencedAt, String resourcePath, ReferencedSubject source, ReferencedSubject target, String url, Boolean willCloseTarget) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.id = id;
        this.isCrossRepository = isCrossRepository;
        this.referencedAt = referencedAt;
        this.resourcePath = resourcePath;
        this.source = source;
        this.target = target;
        this.url = url;
        this.willCloseTarget = willCloseTarget;
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

    public String getReferencedAt() {
        return referencedAt;
    }
    public void setReferencedAt(String referencedAt) {
        this.referencedAt = referencedAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public ReferencedSubject getSource() {
        return source;
    }
    public void setSource(ReferencedSubject source) {
        this.source = source;
    }

    public ReferencedSubject getTarget() {
        return target;
    }
    public void setTarget(ReferencedSubject target) {
        this.target = target;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getWillCloseTarget() {
        return willCloseTarget;
    }
    public void setWillCloseTarget(Boolean willCloseTarget) {
        this.willCloseTarget = willCloseTarget;
    }

}