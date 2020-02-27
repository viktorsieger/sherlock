package se.umu.cs.graphql;

import java.util.*;

public interface RegistryPackageOwner {

    String getId();

    RegistryPackageConnection getRegistryPackages();

}