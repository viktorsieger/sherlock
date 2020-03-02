package se.umu.cs.githubtypes;

public class SponsorsTier implements Node{

    private SponsorsTierAdminInfo adminInfo;
    private String createdAt;
    private String description;
    private String descriptionHTML;
    private String id;
    private Integer monthlyPriceInCents;
    private Integer monthlyPriceInDollars;
    private String name;
    private SponsorsListing sponsorsListing;
    private String updatedAt;

    public SponsorsTier() {
    }

    public SponsorsTier(SponsorsTierAdminInfo adminInfo, String createdAt, String description, String descriptionHTML, String id, Integer monthlyPriceInCents, Integer monthlyPriceInDollars, String name, SponsorsListing sponsorsListing, String updatedAt) {
        this.adminInfo = adminInfo;
        this.createdAt = createdAt;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.id = id;
        this.monthlyPriceInCents = monthlyPriceInCents;
        this.monthlyPriceInDollars = monthlyPriceInDollars;
        this.name = name;
        this.sponsorsListing = sponsorsListing;
        this.updatedAt = updatedAt;
    }

    public SponsorsTierAdminInfo getAdminInfo() {
        return adminInfo;
    }
    public void setAdminInfo(SponsorsTierAdminInfo adminInfo) {
        this.adminInfo = adminInfo;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }
    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getMonthlyPriceInCents() {
        return monthlyPriceInCents;
    }
    public void setMonthlyPriceInCents(Integer monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
    }

    public Integer getMonthlyPriceInDollars() {
        return monthlyPriceInDollars;
    }
    public void setMonthlyPriceInDollars(Integer monthlyPriceInDollars) {
        this.monthlyPriceInDollars = monthlyPriceInDollars;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public SponsorsListing getSponsorsListing() {
        return sponsorsListing;
    }
    public void setSponsorsListing(SponsorsListing sponsorsListing) {
        this.sponsorsListing = sponsorsListing;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}