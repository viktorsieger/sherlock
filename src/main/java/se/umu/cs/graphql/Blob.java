package se.umu.cs.graphql;

import java.util.*;

public class Blob implements GitObject, Node{

    private String abbreviatedOid;
    private Integer byteSize;
    private String commitResourcePath;
    private String commitUrl;
    private String id;
    private Boolean isBinary;
    private Boolean isTruncated;
    private String oid;
    private Repository repository;
    private String text;

    public Blob() {
    }

    public Blob(String abbreviatedOid, Integer byteSize, String commitResourcePath, String commitUrl, String id, Boolean isBinary, Boolean isTruncated, String oid, Repository repository, String text) {
        this.abbreviatedOid = abbreviatedOid;
        this.byteSize = byteSize;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.id = id;
        this.isBinary = isBinary;
        this.isTruncated = isTruncated;
        this.oid = oid;
        this.repository = repository;
        this.text = text;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }
    public void setAbbreviatedOid(String abbreviatedOid) {
        this.abbreviatedOid = abbreviatedOid;
    }

    public Integer getByteSize() {
        return byteSize;
    }
    public void setByteSize(Integer byteSize) {
        this.byteSize = byteSize;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }
    public void setCommitResourcePath(String commitResourcePath) {
        this.commitResourcePath = commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBinary() {
        return isBinary;
    }
    public void setIsBinary(Boolean isBinary) {
        this.isBinary = isBinary;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    public String getOid() {
        return oid;
    }
    public void setOid(String oid) {
        this.oid = oid;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}