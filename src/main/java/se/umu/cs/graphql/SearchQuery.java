package se.umu.cs.graphql;

import java.util.*;

public interface SearchQuery {

    SearchResultItemConnection search(String after, String before, Integer first, Integer last, String query, SearchType type) throws Exception;

}