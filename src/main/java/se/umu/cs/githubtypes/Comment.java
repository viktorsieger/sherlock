package se.umu.cs.githubtypes;

public interface Comment {

    Actor getAuthor();

    CommentAuthorAssociation getAuthorAssociation();

    String getBody();

    String getBodyHTML();

    String getBodyText();

    String getCreatedAt();

    Boolean getCreatedViaEmail();

    Actor getEditor();

    String getId();

    Boolean getIncludesCreatedEdit();

    String getLastEditedAt();

    String getPublishedAt();

    String getUpdatedAt();

    UserContentEditConnection getUserContentEdits();

    Boolean getViewerDidAuthor();

}