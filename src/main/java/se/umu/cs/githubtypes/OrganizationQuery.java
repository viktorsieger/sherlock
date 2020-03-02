package se.umu.cs.githubtypes;

public interface OrganizationQuery {

    Organization organization(String login) throws Exception;

}