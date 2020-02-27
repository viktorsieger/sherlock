package se.umu.cs.graphql;

import java.util.*;

public class CheckSuite implements Node{

    private App app;
    private Ref branch;
    private CheckRunConnection checkRuns;
    private Commit commit;
    private CheckConclusionState conclusion;
    private String createdAt;
    private Integer databaseId;
    private String id;
    private PullRequestConnection matchingPullRequests;
    private Push push;
    private Repository repository;
    private String resourcePath;
    private CheckStatusState status;
    private String updatedAt;
    private String url;

    public CheckSuite() {
    }

    public CheckSuite(App app, Ref branch, CheckRunConnection checkRuns, Commit commit, CheckConclusionState conclusion, String createdAt, Integer databaseId, String id, PullRequestConnection matchingPullRequests, Push push, Repository repository, String resourcePath, CheckStatusState status, String updatedAt, String url) {
        this.app = app;
        this.branch = branch;
        this.checkRuns = checkRuns;
        this.commit = commit;
        this.conclusion = conclusion;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.id = id;
        this.matchingPullRequests = matchingPullRequests;
        this.push = push;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public App getApp() {
        return app;
    }
    public void setApp(App app) {
        this.app = app;
    }

    public Ref getBranch() {
        return branch;
    }
    public void setBranch(Ref branch) {
        this.branch = branch;
    }

    public CheckRunConnection getCheckRuns() {
        return checkRuns;
    }
    public void setCheckRuns(CheckRunConnection checkRuns) {
        this.checkRuns = checkRuns;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public CheckConclusionState getConclusion() {
        return conclusion;
    }
    public void setConclusion(CheckConclusionState conclusion) {
        this.conclusion = conclusion;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    public PullRequestConnection getMatchingPullRequests() {
        return matchingPullRequests;
    }
    public void setMatchingPullRequests(PullRequestConnection matchingPullRequests) {
        this.matchingPullRequests = matchingPullRequests;
    }

    public Push getPush() {
        return push;
    }
    public void setPush(Push push) {
        this.push = push;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public CheckStatusState getStatus() {
        return status;
    }
    public void setStatus(CheckStatusState status) {
        this.status = status;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}