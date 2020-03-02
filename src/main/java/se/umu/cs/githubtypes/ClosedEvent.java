package se.umu.cs.githubtypes;

public class ClosedEvent implements IssueTimelineItem, IssueTimelineItems, PullRequestTimelineItem, PullRequestTimelineItems, Node, UniformResourceLocatable{

    private Actor actor;
    private Closable closable;
    private Closer closer;
    private String createdAt;
    private String id;
    private String resourcePath;
    private String url;

    public ClosedEvent() {
    }

    public ClosedEvent(Actor actor, Closable closable, Closer closer, String createdAt, String id, String resourcePath, String url) {
        this.actor = actor;
        this.closable = closable;
        this.closer = closer;
        this.createdAt = createdAt;
        this.id = id;
        this.resourcePath = resourcePath;
        this.url = url;
    }

    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Closable getClosable() {
        return closable;
    }
    public void setClosable(Closable closable) {
        this.closable = closable;
    }

    public Closer getCloser() {
        return closer;
    }
    public void setCloser(Closer closer) {
        this.closer = closer;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}