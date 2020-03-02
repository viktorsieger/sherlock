package se.umu.cs.githubtypes;

public interface SearchQuery {

    SearchResultItemConnection search(String after, String before, Integer first, Integer last, String query, SearchType type) throws Exception;

}