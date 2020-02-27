package se.umu.cs.graphql;

public enum MergeStateStatus {

    BEHIND, 
    BLOCKED, 
    CLEAN, 
    DIRTY, 
    DRAFT, 
    HAS_HOOKS, 
    UNKNOWN, 
    UNSTABLE

}