package se.umu.cs.graphql;

import java.util.*;

public interface Contribution {

    Boolean getIsRestricted();

    String getOccurredAt();

    String getResourcePath();

    String getUrl();

    User getUser();

}