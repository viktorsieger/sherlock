package se.umu.cs.githubtypes;

import java.util.Collection;

public interface MarketplaceListingsQuery {

    MarketplaceListingConnection marketplaceListings(String adminId, String after, Boolean allStates, String before, String categorySlug, Integer first, Integer last, String organizationId, Boolean primaryCategoryOnly, Collection<String> slugs, Boolean useTopicAliases, Boolean viewerCanAdmin, Boolean withFreeTrialsOnly) throws Exception;

}