package se.umu.cs.graphql;

import java.util.*;

public class Push implements Node{

    private String id;
    private String nextSha;
    private String permalink;
    private String previousSha;
    private User pusher;
    private Repository repository;

    public Push() {
    }

    public Push(String id, String nextSha, String permalink, String previousSha, User pusher, Repository repository) {
        this.id = id;
        this.nextSha = nextSha;
        this.permalink = permalink;
        this.previousSha = previousSha;
        this.pusher = pusher;
        this.repository = repository;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNextSha() {
        return nextSha;
    }
    public void setNextSha(String nextSha) {
        this.nextSha = nextSha;
    }

    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPreviousSha() {
        return previousSha;
    }
    public void setPreviousSha(String previousSha) {
        this.previousSha = previousSha;
    }

    public User getPusher() {
        return pusher;
    }
    public void setPusher(User pusher) {
        this.pusher = pusher;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}