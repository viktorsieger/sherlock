package se.umu.cs.githubtypes;

public interface EnterpriseAdministratorInvitationByTokenQuery {

    EnterpriseAdministratorInvitation enterpriseAdministratorInvitationByToken(String invitationToken) throws Exception;

}