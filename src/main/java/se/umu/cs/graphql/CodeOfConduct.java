package se.umu.cs.graphql;

import java.util.*;

public class CodeOfConduct implements Node{

    private String body;
    private String id;
    private String key;
    private String name;
    private String resourcePath;
    private String url;

    public CodeOfConduct() {
    }

    public CodeOfConduct(String body, String id, String key, String name, String resourcePath, String url) {
        this.body = body;
        this.id = id;
        this.key = key;
        this.name = name;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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