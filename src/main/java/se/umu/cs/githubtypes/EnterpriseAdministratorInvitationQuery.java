package se.umu.cs.githubtypes;

public interface EnterpriseAdministratorInvitationQuery {

    EnterpriseAdministratorInvitation enterpriseAdministratorInvitation(String enterpriseSlug, EnterpriseAdministratorRole role, String userLogin) throws Exception;

}