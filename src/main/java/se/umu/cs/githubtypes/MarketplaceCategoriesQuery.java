package se.umu.cs.githubtypes;

import java.util.Collection;

public interface MarketplaceCategoriesQuery {

    Collection<MarketplaceCategory> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, Collection<String> includeCategories) throws Exception;

}