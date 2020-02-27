package se.umu.cs.graphql;

import java.util.*;

public interface GitSignature {

    String getEmail();

    Boolean getIsValid();

    String getPayload();

    String getSignature();

    User getSigner();

    GitSignatureState getState();

    Boolean getWasSignedByGitHub();

}