package se.umu.cs.githubtypes;

public interface Sponsorable {

    SponsorsListing getSponsorsListing();

    SponsorshipConnection getSponsorshipsAsMaintainer();

    SponsorshipConnection getSponsorshipsAsSponsor();

}