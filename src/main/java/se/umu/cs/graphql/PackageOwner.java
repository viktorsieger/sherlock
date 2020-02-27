package se.umu.cs.graphql;

import java.util.*;

public interface PackageOwner {

    String getId();

    PackageConnection getPackages();

}