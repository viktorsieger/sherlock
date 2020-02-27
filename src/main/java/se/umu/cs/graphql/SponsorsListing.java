package se.umu.cs.graphql;

import java.util.*;

public class SponsorsListing implements Node{

    private String createdAt;
    private String fullDescription;
    private String fullDescriptionHTML;
    private String id;
    private String name;
    private String shortDescription;
    private String slug;
    private SponsorsTierConnection tiers;

    public SponsorsListing() {
    }

    public SponsorsListing(String createdAt, String fullDescription, String fullDescriptionHTML, String id, String name, String shortDescription, String slug, SponsorsTierConnection tiers) {
        this.createdAt = createdAt;
        this.fullDescription = fullDescription;
        this.fullDescriptionHTML = fullDescriptionHTML;
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.slug = slug;
        this.tiers = tiers;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getFullDescription() {
        return fullDescription;
    }
    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getFullDescriptionHTML() {
        return fullDescriptionHTML;
    }
    public void setFullDescriptionHTML(String fullDescriptionHTML) {
        this.fullDescriptionHTML = fullDescriptionHTML;
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

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public SponsorsTierConnection getTiers() {
        return tiers;
    }
    public void setTiers(SponsorsTierConnection tiers) {
        this.tiers = tiers;
    }

}