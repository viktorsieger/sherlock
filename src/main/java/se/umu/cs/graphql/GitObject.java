package se.umu.cs.graphql;

import java.util.*;

public interface GitObject {

    String getAbbreviatedOid();

    String getCommitResourcePath();

    String getCommitUrl();

    String getId();

    String getOid();

    Repository getRepository();

}