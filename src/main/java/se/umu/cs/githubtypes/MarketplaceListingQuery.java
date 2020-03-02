package se.umu.cs.githubtypes;

public interface MarketplaceListingQuery {

    MarketplaceListing marketplaceListing(String slug) throws Exception;

}