package se.umu.cs.graphql;

import java.util.*;

public class Ref implements Node{

    private PullRequestConnection associatedPullRequests;
    private String id;
    private String name;
    private String prefix;
    private Repository repository;
    private GitObject target;

    public Ref() {
    }

    public Ref(PullRequestConnection associatedPullRequests, String id, String name, String prefix, Repository repository, GitObject target) {
        this.associatedPullRequests = associatedPullRequests;
        this.id = id;
        this.name = name;
        this.prefix = prefix;
        this.repository = repository;
        this.target = target;
    }

    public PullRequestConnection getAssociatedPullRequests() {
        return associatedPullRequests;
    }
    public void setAssociatedPullRequests(PullRequestConnection associatedPullRequests) {
        this.associatedPullRequests = associatedPullRequests;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public GitObject getTarget() {
        return target;
    }
    public void setTarget(GitObject target) {
        this.target = target;
    }

}