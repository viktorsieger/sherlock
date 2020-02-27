package se.umu.cs.graphql;

import java.util.*;

public class PullRequestCommit implements PullRequestTimelineItems, Node, UniformResourceLocatable{

    private Commit commit;
    private String id;
    private PullRequest pullRequest;
    private String resourcePath;
    private String url;

    public PullRequestCommit() {
    }

    public PullRequestCommit(Commit commit, String id, PullRequest pullRequest, String resourcePath, String url) {
        this.commit = commit;
        this.id = id;
        this.pullRequest = pullRequest;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}