package se.umu.cs.graphql;

import java.util.*;

public class DependencyGraphManifest implements Node{

    private String blobPath;
    private DependencyGraphDependencyConnection dependencies;
    private Integer dependenciesCount;
    private Boolean exceedsMaxSize;
    private String filename;
    private String id;
    private Boolean parseable;
    private Repository repository;

    public DependencyGraphManifest() {
    }

    public DependencyGraphManifest(String blobPath, DependencyGraphDependencyConnection dependencies, Integer dependenciesCount, Boolean exceedsMaxSize, String filename, String id, Boolean parseable, Repository repository) {
        this.blobPath = blobPath;
        this.dependencies = dependencies;
        this.dependenciesCount = dependenciesCount;
        this.exceedsMaxSize = exceedsMaxSize;
        this.filename = filename;
        this.id = id;
        this.parseable = parseable;
        this.repository = repository;
    }

    public String getBlobPath() {
        return blobPath;
    }
    public void setBlobPath(String blobPath) {
        this.blobPath = blobPath;
    }

    public DependencyGraphDependencyConnection getDependencies() {
        return dependencies;
    }
    public void setDependencies(DependencyGraphDependencyConnection dependencies) {
        this.dependencies = dependencies;
    }

    public Integer getDependenciesCount() {
        return dependenciesCount;
    }
    public void setDependenciesCount(Integer dependenciesCount) {
        this.dependenciesCount = dependenciesCount;
    }

    public Boolean getExceedsMaxSize() {
        return exceedsMaxSize;
    }
    public void setExceedsMaxSize(Boolean exceedsMaxSize) {
        this.exceedsMaxSize = exceedsMaxSize;
    }

    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getParseable() {
        return parseable;
    }
    public void setParseable(Boolean parseable) {
        this.parseable = parseable;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}