package se.umu.cs.graphql;

import java.util.*;

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