package se.umu.cs.githubtypes;

public interface AuditEntry {

    String getAction();

    AuditEntryActor getActor();

    String getActorIp();

    ActorLocation getActorLocation();

    String getActorLogin();

    String getActorResourcePath();

    String getActorUrl();

    String getCreatedAt();

    OperationType getOperationType();

    User getUser();

    String getUserLogin();

    String getUserResourcePath();

    String getUserUrl();

}