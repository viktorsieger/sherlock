package se.umu.cs.graphql;

import java.util.*;

public class Sponsorship implements Node{

    private String createdAt;
    private String id;
    private User maintainer;
    private SponsorshipPrivacy privacyLevel;
    private User sponsor;
    private Sponsorable sponsorable;
    private SponsorsTier tier;

    public Sponsorship() {
    }

    public Sponsorship(String createdAt, String id, User maintainer, SponsorshipPrivacy privacyLevel, User sponsor, Sponsorable sponsorable, SponsorsTier tier) {
        this.createdAt = createdAt;
        this.id = id;
        this.maintainer = maintainer;
        this.privacyLevel = privacyLevel;
        this.sponsor = sponsor;
        this.sponsorable = sponsorable;
        this.tier = tier;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public User getMaintainer() {
        return maintainer;
    }
    public void setMaintainer(User maintainer) {
        this.maintainer = maintainer;
    }

    public SponsorshipPrivacy getPrivacyLevel() {
        return privacyLevel;
    }
    public void setPrivacyLevel(SponsorshipPrivacy privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public User getSponsor() {
        return sponsor;
    }
    public void setSponsor(User sponsor) {
        this.sponsor = sponsor;
    }

    public Sponsorable getSponsorable() {
        return sponsorable;
    }
    public void setSponsorable(Sponsorable sponsorable) {
        this.sponsorable = sponsorable;
    }

    public SponsorsTier getTier() {
        return tier;
    }
    public void setTier(SponsorsTier tier) {
        this.tier = tier;
    }

}