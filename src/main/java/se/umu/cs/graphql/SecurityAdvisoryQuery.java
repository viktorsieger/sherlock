package se.umu.cs.graphql;

import java.util.*;

public interface SecurityAdvisoryQuery {

    SecurityAdvisory securityAdvisory(String ghsaId) throws Exception;

}