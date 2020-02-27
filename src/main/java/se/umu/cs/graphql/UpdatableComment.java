package se.umu.cs.graphql;

import java.util.*;

public interface UpdatableComment {

    Collection<CommentCannotUpdateReason> getViewerCannotUpdateReasons();

}