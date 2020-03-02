package se.umu.cs.githubtypes;

import java.util.Collection;

public class Tree implements GitObject, Node{

    private String abbreviatedOid;
    private String commitResourcePath;
    private String commitUrl;
    private Collection<TreeEntry> entries;
    private String id;
    private String oid;
    private Repository repository;

    public Tree() {
    }

    public Tree(String abbreviatedOid, String commitResourcePath, String commitUrl, Collection<TreeEntry> entries, String id, String oid, Repository repository) {
        this.abbreviatedOid = abbreviatedOid;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.entries = entries;
        this.id = id;
        this.oid = oid;
        this.repository = repository;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }
    public void setAbbreviatedOid(String abbreviatedOid) {
        this.abbreviatedOid = abbreviatedOid;
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

    public Collection<TreeEntry> getEntries() {
        return entries;
    }
    public void setEntries(Collection<TreeEntry> entries) {
        this.entries = entries;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

}