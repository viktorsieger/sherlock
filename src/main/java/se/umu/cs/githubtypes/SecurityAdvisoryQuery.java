package se.umu.cs.githubtypes;

public interface SecurityAdvisoryQuery {

    SecurityAdvisory securityAdvisory(String ghsaId) throws Exception;

}