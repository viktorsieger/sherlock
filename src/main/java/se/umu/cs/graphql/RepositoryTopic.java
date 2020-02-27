package se.umu.cs.graphql;

import java.util.*;

public class RepositoryTopic implements Node, UniformResourceLocatable{

    private String id;
    private String resourcePath;
    private Topic topic;
    private String url;

    public RepositoryTopic() {
    }

    public RepositoryTopic(String id, String resourcePath, Topic topic, String url) {
        this.id = id;
        this.resourcePath = resourcePath;
        this.topic = topic;
        this.url = url;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public Topic getTopic() {
        return topic;
    }
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}