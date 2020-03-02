package se.umu.cs.githubtypes;

public class Tag implements GitObject, Node{

    private String abbreviatedOid;
    private String commitResourcePath;
    private String commitUrl;
    private String id;
    private String message;
    private String name;
    private String oid;
    private Repository repository;
    private GitActor tagger;
    private GitObject target;

    public Tag() {
    }

    public Tag(String abbreviatedOid, String commitResourcePath, String commitUrl, String id, String message, String name, String oid, Repository repository, GitActor tagger, GitObject target) {
        this.abbreviatedOid = abbreviatedOid;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.id = id;
        this.message = message;
        this.name = name;
        this.oid = oid;
        this.repository = repository;
        this.tagger = tagger;
        this.target = target;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public GitActor getTagger() {
        return tagger;
    }
    public void setTagger(GitActor tagger) {
        this.tagger = tagger;
    }

    public GitObject getTarget() {
        return target;
    }
    public void setTarget(GitObject target) {
        this.target = target;
    }

}