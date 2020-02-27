package se.umu.cs.graphql;

import java.util.*;

public class RenamedTitleEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node{

    private Actor actor;
    private String createdAt;
    private String currentTitle;
    private String id;
    private String previousTitle;
    private RenamedTitleSubject subject;

    public RenamedTitleEvent() {
    }

    public RenamedTitleEvent(Actor actor, String createdAt, String currentTitle, String id, String previousTitle, RenamedTitleSubject subject) {
        this.actor = actor;
        this.createdAt = createdAt;
        this.currentTitle = currentTitle;
        this.id = id;
        this.previousTitle = previousTitle;
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

    public String getCurrentTitle() {
        return currentTitle;
    }
    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPreviousTitle() {
        return previousTitle;
    }
    public void setPreviousTitle(String previousTitle) {
        this.previousTitle = previousTitle;
    }

    public RenamedTitleSubject getSubject() {
        return subject;
    }
    public void setSubject(RenamedTitleSubject subject) {
        this.subject = subject;
    }

}