package se.umu.cs.githubtypes;

import java.util.Collection;

public interface NodesQuery {

    Collection<Node> nodes(Collection<String> ids) throws Exception;

}