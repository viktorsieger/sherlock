package se.umu.cs.graphql;

import java.util.*;

public class Hovercard {

    private Collection<HovercardContext> contexts;

    public Hovercard() {
    }

    public Hovercard(Collection<HovercardContext> contexts) {
        this.contexts = contexts;
    }

    public Collection<HovercardContext> getContexts() {
        return contexts;
    }
    public void setContexts(Collection<HovercardContext> contexts) {
        this.contexts = contexts;
    }

}