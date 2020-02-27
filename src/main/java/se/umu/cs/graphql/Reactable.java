package se.umu.cs.graphql;

import java.util.*;

public interface Reactable {

    Integer getDatabaseId();

    String getId();

    Collection<ReactionGroup> getReactionGroups();

    ReactionConnection getReactions();

    Boolean getViewerCanReact();

}