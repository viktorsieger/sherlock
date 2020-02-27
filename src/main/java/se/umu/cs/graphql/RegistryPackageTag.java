package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackageTag implements Node{

    private String id;
    private String name;
    private RegistryPackageVersion version;

    public RegistryPackageTag() {
    }

    public RegistryPackageTag(String id, String name, RegistryPackageVersion version) {
        this.id = id;
        this.name = name;
        this.version = version;
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

    public RegistryPackageVersion getVersion() {
        return version;
    }
    public void setVersion(RegistryPackageVersion version) {
        this.version = version;
    }

}