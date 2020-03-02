package se.umu.cs.githubtypes;

public interface Contribution {

    Boolean getIsRestricted();

    String getOccurredAt();

    String getResourcePath();

    String getUrl();

    User getUser();

}