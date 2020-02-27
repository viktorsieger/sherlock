package se.umu.cs.graphql;

import java.util.*;

public class PublicKey implements Node{

    private String accessedAt;
    private String createdAt;
    private String fingerprint;
    private String id;
    private Boolean isReadOnly;
    private String key;
    private String updatedAt;

    public PublicKey() {
    }

    public PublicKey(String accessedAt, String createdAt, String fingerprint, String id, Boolean isReadOnly, String key, String updatedAt) {
        this.accessedAt = accessedAt;
        this.createdAt = createdAt;
        this.fingerprint = fingerprint;
        this.id = id;
        this.isReadOnly = isReadOnly;
        this.key = key;
        this.updatedAt = updatedAt;
    }

    public String getAccessedAt() {
        return accessedAt;
    }
    public void setAccessedAt(String accessedAt) {
        this.accessedAt = accessedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getFingerprint() {
        return fingerprint;
    }
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }
    public void setIsReadOnly(Boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}