package se.umu.cs.graphql;

import java.util.*;

public class DependencyGraphDependency {

    private Boolean hasDependencies;
    private String packageManager;
    private String packageName;
    private Repository repository;
    private String requirements;

    public DependencyGraphDependency() {
    }

    public DependencyGraphDependency(Boolean hasDependencies, String packageManager, String packageName, Repository repository, String requirements) {
        this.hasDependencies = hasDependencies;
        this.packageManager = packageManager;
        this.packageName = packageName;
        this.repository = repository;
        this.requirements = requirements;
    }

    public Boolean getHasDependencies() {
        return hasDependencies;
    }
    public void setHasDependencies(Boolean hasDependencies) {
        this.hasDependencies = hasDependencies;
    }

    public String getPackageManager() {
        return packageManager;
    }
    public void setPackageManager(String packageManager) {
        this.packageManager = packageManager;
    }

    public String getPackageName() {
        return packageName;
    }
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getRequirements() {
        return requirements;
    }
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

}