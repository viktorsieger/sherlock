package se.umu.cs.graphql;

import java.util.*;

public interface OrganizationQuery {

    Organization organization(String login) throws Exception;

}