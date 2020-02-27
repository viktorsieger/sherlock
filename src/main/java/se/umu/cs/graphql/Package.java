package se.umu.cs.graphql;

import java.util.*;

public class Package implements Node{

    private String id;
    private PackageVersion latestVersion;
    private String name;
    private PackageType packageType;
    private Repository repository;
    private PackageStatistics statistics;
    private PackageVersion version;
    private PackageVersionConnection versions;

    public Package() {
    }

    public Package(String id, PackageVersion latestVersion, String name, PackageType packageType, Repository repository, PackageStatistics statistics, PackageVersion version, PackageVersionConnection versions) {
        this.id = id;
        this.latestVersion = latestVersion;
        this.name = name;
        this.packageType = packageType;
        this.repository = repository;
        this.statistics = statistics;
        this.version = version;
        this.versions = versions;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public PackageVersion getLatestVersion() {
        return latestVersion;
    }
    public void setLatestVersion(PackageVersion latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public PackageType getPackageType() {
        return packageType;
    }
    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public PackageStatistics getStatistics() {
        return statistics;
    }
    public void setStatistics(PackageStatistics statistics) {
        this.statistics = statistics;
    }

    public PackageVersion getVersion() {
        return version;
    }
    public void setVersion(PackageVersion version) {
        this.version = version;
    }

    public PackageVersionConnection getVersions() {
        return versions;
    }
    public void setVersions(PackageVersionConnection versions) {
        this.versions = versions;
    }

}