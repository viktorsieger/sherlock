package se.umu.cs.graphql;

import java.util.*;

public class TreeEntry {

    private Integer mode;
    private String name;
    private GitObject object;
    private String oid;
    private Repository repository;
    private String type;

    public TreeEntry() {
    }

    public TreeEntry(Integer mode, String name, GitObject object, String oid, Repository repository, String type) {
        this.mode = mode;
        this.name = name;
        this.object = object;
        this.oid = oid;
        this.repository = repository;
        this.type = type;
    }

    public Integer getMode() {
        return mode;
    }
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GitObject getObject() {
        return object;
    }
    public void setObject(GitObject object) {
        this.object = object;
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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}