package se.umu.cs.graphql;

import java.util.*;

public interface EnterpriseAdministratorInvitationByTokenQuery {

    EnterpriseAdministratorInvitation enterpriseAdministratorInvitationByToken(String invitationToken) throws Exception;

}