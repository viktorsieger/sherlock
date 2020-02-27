package se.umu.cs.graphql;

import java.util.*;

public class RegistryPackage implements Node{

    private String color;
    private String id;
    private RegistryPackageVersion latestVersion;
    private String name;
    private String nameWithOwner;
    private RegistryPackageFile packageFileByGuid;
    private RegistryPackageFile packageFileBySha256;
    private RegistryPackageType packageType;
    private RegistryPackageVersionConnection preReleaseVersions;
    private String registryPackageType;
    private Repository repository;
    private RegistryPackageStatistics statistics;
    private RegistryPackageTagConnection tags;
    private TopicConnection topics;
    private RegistryPackageVersion version;
    private RegistryPackageVersion versionByPlatform;
    private RegistryPackageVersion versionBySha256;
    private RegistryPackageVersionConnection versions;
    private RegistryPackageVersionConnection versionsByMetadatum;

    public RegistryPackage() {
    }

    public RegistryPackage(String color, String id, RegistryPackageVersion latestVersion, String name, String nameWithOwner, RegistryPackageFile packageFileByGuid, RegistryPackageFile packageFileBySha256, RegistryPackageType packageType, RegistryPackageVersionConnection preReleaseVersions, String registryPackageType, Repository repository, RegistryPackageStatistics statistics, RegistryPackageTagConnection tags, TopicConnection topics, RegistryPackageVersion version, RegistryPackageVersion versionByPlatform, RegistryPackageVersion versionBySha256, RegistryPackageVersionConnection versions, RegistryPackageVersionConnection versionsByMetadatum) {
        this.color = color;
        this.id = id;
        this.latestVersion = latestVersion;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
        this.packageFileByGuid = packageFileByGuid;
        this.packageFileBySha256 = packageFileBySha256;
        this.packageType = packageType;
        this.preReleaseVersions = preReleaseVersions;
        this.registryPackageType = registryPackageType;
        this.repository = repository;
        this.statistics = statistics;
        this.tags = tags;
        this.topics = topics;
        this.version = version;
        this.versionByPlatform = versionByPlatform;
        this.versionBySha256 = versionBySha256;
        this.versions = versions;
        this.versionsByMetadatum = versionsByMetadatum;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public RegistryPackageVersion getLatestVersion() {
        return latestVersion;
    }
    public void setLatestVersion(RegistryPackageVersion latestVersion) {
        this.latestVersion = latestVersion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }
    public void setNameWithOwner(String nameWithOwner) {
        this.nameWithOwner = nameWithOwner;
    }

    public RegistryPackageFile getPackageFileByGuid() {
        return packageFileByGuid;
    }
    public void setPackageFileByGuid(RegistryPackageFile packageFileByGuid) {
        this.packageFileByGuid = packageFileByGuid;
    }

    public RegistryPackageFile getPackageFileBySha256() {
        return packageFileBySha256;
    }
    public void setPackageFileBySha256(RegistryPackageFile packageFileBySha256) {
        this.packageFileBySha256 = packageFileBySha256;
    }

    public RegistryPackageType getPackageType() {
        return packageType;
    }
    public void setPackageType(RegistryPackageType packageType) {
        this.packageType = packageType;
    }

    public RegistryPackageVersionConnection getPreReleaseVersions() {
        return preReleaseVersions;
    }
    public void setPreReleaseVersions(RegistryPackageVersionConnection preReleaseVersions) {
        this.preReleaseVersions = preReleaseVersions;
    }

    public String getRegistryPackageType() {
        return registryPackageType;
    }
    public void setRegistryPackageType(String registryPackageType) {
        this.registryPackageType = registryPackageType;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public RegistryPackageStatistics getStatistics() {
        return statistics;
    }
    public void setStatistics(RegistryPackageStatistics statistics) {
        this.statistics = statistics;
    }

    public RegistryPackageTagConnection getTags() {
        return tags;
    }
    public void setTags(RegistryPackageTagConnection tags) {
        this.tags = tags;
    }

    public TopicConnection getTopics() {
        return topics;
    }
    public void setTopics(TopicConnection topics) {
        this.topics = topics;
    }

    public RegistryPackageVersion getVersion() {
        return version;
    }
    public void setVersion(RegistryPackageVersion version) {
        this.version = version;
    }

    public RegistryPackageVersion getVersionByPlatform() {
        return versionByPlatform;
    }
    public void setVersionByPlatform(RegistryPackageVersion versionByPlatform) {
        this.versionByPlatform = versionByPlatform;
    }

    public RegistryPackageVersion getVersionBySha256() {
        return versionBySha256;
    }
    public void setVersionBySha256(RegistryPackageVersion versionBySha256) {
        this.versionBySha256 = versionBySha256;
    }

    public RegistryPackageVersionConnection getVersions() {
        return versions;
    }
    public void setVersions(RegistryPackageVersionConnection versions) {
        this.versions = versions;
    }

    public RegistryPackageVersionConnection getVersionsByMetadatum() {
        return versionsByMetadatum;
    }
    public void setVersionsByMetadatum(RegistryPackageVersionConnection versionsByMetadatum) {
        this.versionsByMetadatum = versionsByMetadatum;
    }

}