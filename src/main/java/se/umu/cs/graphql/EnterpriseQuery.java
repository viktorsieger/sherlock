package se.umu.cs.graphql;

import java.util.*;

public interface EnterpriseQuery {

    Enterprise enterprise(String invitationToken, String slug) throws Exception;

}