package se.umu.cs.graphql;

import java.util.*;

public interface Sponsorable {

    SponsorsListing getSponsorsListing();

    SponsorshipConnection getSponsorshipsAsMaintainer();

    SponsorshipConnection getSponsorshipsAsSponsor();

}