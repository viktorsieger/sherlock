package se.umu.cs.githubtypes;

public interface GitSignature {

    String getEmail();

    Boolean getIsValid();

    String getPayload();

    String getSignature();

    User getSigner();

    GitSignatureState getState();

    Boolean getWasSignedByGitHub();

}