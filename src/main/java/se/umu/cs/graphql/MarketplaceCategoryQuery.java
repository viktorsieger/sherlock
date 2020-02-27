package se.umu.cs.graphql;

import java.util.*;

public interface MarketplaceCategoryQuery {

    MarketplaceCategory marketplaceCategory(String slug, Boolean useTopicAliases) throws Exception;

}