package se.umu.cs.graphql;

import java.util.*;

public interface LicensesQuery {

    Collection<License> licenses() throws Exception;

}