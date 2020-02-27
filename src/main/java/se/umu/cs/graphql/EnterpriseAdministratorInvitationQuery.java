package se.umu.cs.graphql;

import java.util.*;

public interface EnterpriseAdministratorInvitationQuery {

    EnterpriseAdministratorInvitation enterpriseAdministratorInvitation(String enterpriseSlug, EnterpriseAdministratorRole role, String userLogin) throws Exception;

}