package se.umu.cs.graphql;

import java.util.*;

public class License implements Node{

    private String body;
    private Collection<LicenseRule> conditions;
    private String description;
    private Boolean featured;
    private Boolean hidden;
    private String id;
    private String implementation;
    private String key;
    private Collection<LicenseRule> limitations;
    private String name;
    private String nickname;
    private Collection<LicenseRule> permissions;
    private Boolean pseudoLicense;
    private String spdxId;
    private String url;

    public License() {
    }

    public License(String body, Collection<LicenseRule> conditions, String description, Boolean featured, Boolean hidden, String id, String implementation, String key, Collection<LicenseRule> limitations, String name, String nickname, Collection<LicenseRule> permissions, Boolean pseudoLicense, String spdxId, String url) {
        this.body = body;
        this.conditions = conditions;
        this.description = description;
        this.featured = featured;
        this.hidden = hidden;
        this.id = id;
        this.implementation = implementation;
        this.key = key;
        this.limitations = limitations;
        this.name = name;
        this.nickname = nickname;
        this.permissions = permissions;
        this.pseudoLicense = pseudoLicense;
        this.spdxId = spdxId;
        this.url = url;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public Collection<LicenseRule> getConditions() {
        return conditions;
    }
    public void setConditions(Collection<LicenseRule> conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFeatured() {
        return featured;
    }
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    public Boolean getHidden() {
        return hidden;
    }
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getImplementation() {
        return implementation;
    }
    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Collection<LicenseRule> getLimitations() {
        return limitations;
    }
    public void setLimitations(Collection<LicenseRule> limitations) {
        this.limitations = limitations;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Collection<LicenseRule> getPermissions() {
        return permissions;
    }
    public void setPermissions(Collection<LicenseRule> permissions) {
        this.permissions = permissions;
    }

    public Boolean getPseudoLicense() {
        return pseudoLicense;
    }
    public void setPseudoLicense(Boolean pseudoLicense) {
        this.pseudoLicense = pseudoLicense;
    }

    public String getSpdxId() {
        return spdxId;
    }
    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}