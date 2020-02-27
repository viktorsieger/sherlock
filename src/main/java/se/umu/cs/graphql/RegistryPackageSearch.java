package se.umu.cs.graphql;

import java.util.*;

public interface RegistryPackageSearch {

    String getId();

    RegistryPackageConnection getRegistryPackagesForQuery();

}