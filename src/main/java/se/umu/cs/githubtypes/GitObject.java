package se.umu.cs.githubtypes;

public interface GitObject {

    String getAbbreviatedOid();

    String getCommitResourcePath();

    String getCommitUrl();

    String getId();

    String getOid();

    Repository getRepository();

}