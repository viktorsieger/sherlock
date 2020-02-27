package se.umu.cs.graphql;

import java.util.*;

public interface NodesQuery {

    Collection<Node> nodes(Collection<String> ids) throws Exception;

}