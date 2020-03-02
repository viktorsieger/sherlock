package se.umu.cs.githubtypes;

import java.util.Collection;

public interface SecurityVulnerabilitiesQuery {

    SecurityVulnerabilityConnection securityVulnerabilities(String after, String before, SecurityAdvisoryEcosystem ecosystem, Integer first, Integer last, SecurityVulnerabilityOrder orderBy, String Package, Collection<SecurityAdvisorySeverity> severities) throws Exception;

}