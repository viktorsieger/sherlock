package se.umu.cs.githubtypes;

import java.util.Collection;

public class Status implements Node{

    private Commit commit;
    private StatusContext context;
    private Collection<StatusContext> contexts;
    private String id;
    private StatusState state;

    public Status() {
    }

    public Status(Commit commit, StatusContext context, Collection<StatusContext> contexts, String id, StatusState state) {
        this.commit = commit;
        this.context = context;
        this.contexts = contexts;
        this.id = id;
        this.state = state;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public StatusContext getContext() {
        return context;
    }
    public void setContext(StatusContext context) {
        this.context = context;
    }

    public Collection<StatusContext> getContexts() {
        return contexts;
    }
    public void setContexts(Collection<StatusContext> contexts) {
        this.contexts = contexts;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public StatusState getState() {
        return state;
    }
    public void setState(StatusState state) {
        this.state = state;
    }

}