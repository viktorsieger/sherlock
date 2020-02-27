package se.umu.cs.graphql;

import java.util.*;

public class SponsorsTierAdminInfo {

    private SponsorshipConnection sponsorships;

    public SponsorsTierAdminInfo() {
    }

    public SponsorsTierAdminInfo(SponsorshipConnection sponsorships) {
        this.sponsorships = sponsorships;
    }

    public SponsorshipConnection getSponsorships() {
        return sponsorships;
    }
    public void setSponsorships(SponsorshipConnection sponsorships) {
        this.sponsorships = sponsorships;
    }

}