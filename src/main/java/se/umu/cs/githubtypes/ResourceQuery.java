package se.umu.cs.githubtypes;

public interface ResourceQuery {

    UniformResourceLocatable resource(String url) throws Exception;

}