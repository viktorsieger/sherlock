package se.umu.cs.githubtypes;

public interface SecurityAdvisoriesQuery {

    SecurityAdvisoryConnection securityAdvisories(String after, String before, Integer first, SecurityAdvisoryIdentifierFilter identifier, Integer last, SecurityAdvisoryOrder orderBy, String publishedSince, String updatedSince) throws Exception;

}