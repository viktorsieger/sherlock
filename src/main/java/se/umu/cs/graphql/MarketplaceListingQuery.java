package se.umu.cs.graphql;

import java.util.*;

public interface MarketplaceListingQuery {

    MarketplaceListing marketplaceListing(String slug) throws Exception;

}