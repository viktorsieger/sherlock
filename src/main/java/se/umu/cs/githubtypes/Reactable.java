package se.umu.cs.githubtypes;

import java.util.Collection;

public interface Reactable {

    Integer getDatabaseId();

    String getId();

    Collection<ReactionGroup> getReactionGroups();

    ReactionConnection getReactions();

    Boolean getViewerCanReact();

}