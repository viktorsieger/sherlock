package se.umu.cs.graphql;

import java.util.*;

public interface SponsorsListingQuery {

    SponsorsListing sponsorsListing(String slug) throws Exception;

}