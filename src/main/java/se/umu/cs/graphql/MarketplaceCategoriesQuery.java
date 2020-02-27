package se.umu.cs.graphql;

import java.util.*;

public interface MarketplaceCategoriesQuery {

    Collection<MarketplaceCategory> marketplaceCategories(Boolean excludeEmpty, Boolean excludeSubcategories, Collection<String> includeCategories) throws Exception;

}