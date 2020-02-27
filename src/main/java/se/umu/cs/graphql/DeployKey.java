package se.umu.cs.graphql;

import java.util.*;

public class DeployKey implements Node{

    private String createdAt;
    private String id;
    private String key;
    private Boolean readOnly;
    private String title;
    private Boolean verified;

    public DeployKey() {
    }

    public DeployKey(String createdAt, String id, String key, Boolean readOnly, String title, Boolean verified) {
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.readOnly = readOnly;
        this.title = title;
        this.verified = verified;
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

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVerified() {
        return verified;
    }
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

}