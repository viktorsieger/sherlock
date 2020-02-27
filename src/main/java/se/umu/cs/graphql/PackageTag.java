package se.umu.cs.graphql;

import java.util.*;

public class PackageTag implements Node{

    private String id;
    private String name;
    private PackageVersion version;

    public PackageTag() {
    }

    public PackageTag(String id, String name, PackageVersion version) {
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

    public PackageVersion getVersion() {
        return version;
    }
    public void setVersion(PackageVersion version) {
        this.version = version;
    }

}