package se.umu.cs.graphql;

import java.util.*;

public interface ResourceQuery {

    UniformResourceLocatable resource(String url) throws Exception;

}