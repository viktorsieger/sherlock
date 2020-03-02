package se.umu.cs.githubtypes;

import java.util.Collection;

public interface LicensesQuery {

    Collection<License> licenses() throws Exception;

}