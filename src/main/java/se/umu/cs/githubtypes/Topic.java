package se.umu.cs.githubtypes;

import java.util.Collection;

public class Topic implements Node, Starrable{

    private String id;
    private String name;
    private Collection<Topic> relatedTopics;
    private StargazerConnection stargazers;
    private Boolean viewerHasStarred;

    public Topic() {
    }

    public Topic(String id, String name, Collection<Topic> relatedTopics, StargazerConnection stargazers, Boolean viewerHasStarred) {
        this.id = id;
        this.name = name;
        this.relatedTopics = relatedTopics;
        this.stargazers = stargazers;
        this.viewerHasStarred = viewerHasStarred;
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

    public Collection<Topic> getRelatedTopics() {
        return relatedTopics;
    }
    public void setRelatedTopics(Collection<Topic> relatedTopics) {
        this.relatedTopics = relatedTopics;
    }

    public StargazerConnection getStargazers() {
        return stargazers;
    }
    public void setStargazers(StargazerConnection stargazers) {
        this.stargazers = stargazers;
    }

    public Boolean getViewerHasStarred() {
        return viewerHasStarred;
    }
    public void setViewerHasStarred(Boolean viewerHasStarred) {
        this.viewerHasStarred = viewerHasStarred;
    }

}