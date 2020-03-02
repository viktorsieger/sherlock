package se.umu.cs.githubtypes;

public interface UserQuery {

    User user(String login) throws Exception;

}