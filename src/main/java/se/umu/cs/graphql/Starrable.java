package se.umu.cs.graphql;

import java.util.*;

public interface Starrable {

    String getId();

    StargazerConnection getStargazers();

    Boolean getViewerHasStarred();

}