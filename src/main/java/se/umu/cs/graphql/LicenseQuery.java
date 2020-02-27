package se.umu.cs.graphql;

import java.util.*;

public interface LicenseQuery {

    License license(String key) throws Exception;

}