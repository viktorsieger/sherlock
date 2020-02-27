package se.umu.cs.graphql;

import java.util.*;

public interface SecurityVulnerabilitiesQuery {

    SecurityVulnerabilityConnection securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystem ecosystem, Integer first, Integer last, SecurityVulnerabilityOrder orderBy, String Package, Collection<SecurityAdvisorySeverity> severities) throws Exception;

}