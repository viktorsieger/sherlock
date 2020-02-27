package se.umu.cs.graphql;

import java.util.*;

public interface UserQuery {

    User user(String login) throws Exception;

}