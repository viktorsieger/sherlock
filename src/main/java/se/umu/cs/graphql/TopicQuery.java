package se.umu.cs.graphql;

import java.util.*;

public interface TopicQuery {

    Topic topic(String name) throws Exception;

}