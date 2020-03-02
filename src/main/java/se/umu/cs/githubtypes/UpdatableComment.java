package se.umu.cs.githubtypes;

import java.util.Collection;

public interface UpdatableComment {

    Collection<CommentCannotUpdateReason> getViewerCannotUpdateReasons();

}