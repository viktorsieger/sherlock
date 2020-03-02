package se.umu.cs.githubtypes;

public interface EnterpriseQuery {

    Enterprise enterprise(String invitationToken, String slug) throws Exception;

}