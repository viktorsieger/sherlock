package se.umu.cs.githubtypes;

public interface MarketplaceCategoryQuery {

    MarketplaceCategory marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception;

}