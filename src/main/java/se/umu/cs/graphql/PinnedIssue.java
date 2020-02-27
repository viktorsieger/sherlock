package se.umu.cs.graphql;

import java.util.*;

public class PinnedIssue implements Node{

    private Integer databaseId;
    private String id;
    private Issue issue;
    private Actor pinnedBy;
    private Repository repository;

    public PinnedIssue() {
    }

    public PinnedIssue(Integer databaseId, String id, Issue issue, Actor pinnedBy, Repository repository) {
        this.databaseId = databaseId;
        this.id = id;
        this.issue = issue;
        this.pinnedBy = pinnedBy;
        this.repository = repository;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
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

    public Actor getPinnedBy() {
        return pinnedBy;
    }
    public void setPinnedBy(Actor pinnedBy) {
        this.pinnedBy = pinnedBy;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}