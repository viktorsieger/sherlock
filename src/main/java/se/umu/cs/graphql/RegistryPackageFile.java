package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageFile implements Node{

    private String guid;
    private String id;
    private String md5;
    private String metadataUrl;
    private String name;
    private RegistryPackageVersion packageVersion;
    private String sha1;
    private String sha256;
    private Integer size;
    private String updatedAt;
    private String url;

    public RegistryPackageFile() {
    }

    public RegistryPackageFile(String guid, String id, String md5, String metadataUrl, String name, RegistryPackageVersion packageVersion, String sha1, String sha256, Integer size, String updatedAt, String url) {
        this.guid = guid;
        this.id = id;
        this.md5 = md5;
        this.metadataUrl = metadataUrl;
        this.name = name;
        this.packageVersion = packageVersion;
        this.sha1 = sha1;
        this.sha256 = sha256;
        this.size = size;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public String getGuid() {
        return guid;
    }
    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMd5() {
        return md5;
    }
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getMetadataUrl() {
        return metadataUrl;
    }
    public void setMetadataUrl(String metadataUrl) {
        this.metadataUrl = metadataUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public RegistryPackageVersion getPackageVersion() {
        return packageVersion;
    }
    public void setPackageVersion(RegistryPackageVersion packageVersion) {
        this.packageVersion = packageVersion;
    }

    public String getSha1() {
        return sha1;
    }
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getSha256() {
        return sha256;
    }
    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
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