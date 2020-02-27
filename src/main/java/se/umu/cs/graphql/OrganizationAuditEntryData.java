package se.umu.cs.graphql;

import java.util.*;

public interface OrganizationAuditEntryData {

    Organization getOrganization();

    String getOrganizationName();

    String getOrganizationResourcePath();

    String getOrganizationUrl();

}