package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageDependency implements Node{

    private RegistryPackageDependencyType dependencyType;
    private String id;
    private String name;
    private String version;

    public RegistryPackageDependency() {
    }

    public RegistryPackageDependency(RegistryPackageDependencyType dependencyType, String id, String name, String version) {
        this.dependencyType = dependencyType;
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public RegistryPackageDependencyType getDependencyType() {
        return dependencyType;
    }
    public void setDependencyType(RegistryPackageDependencyType dependencyType) {
        this.dependencyType = dependencyType;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

}