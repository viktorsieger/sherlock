package se.umu.cs.githubtypes;

public interface Starrable {

    String getId();

    StargazerConnection getStargazers();

    Boolean getViewerHasStarred();

}