package se.umu.cs.githubtypes;

public class ContentAttachment {

    private String body;
    private ContentReference contentReference;
    private Integer databaseId;
    private String id;
    private String title;

    public ContentAttachment() {
    }

    public ContentAttachment(String body, ContentReference contentReference, Integer databaseId, String id, String title) {
        this.body = body;
        this.contentReference = contentReference;
        this.databaseId = databaseId;
        this.id = id;
        this.title = title;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public ContentReference getContentReference() {
        return contentReference;
    }
    public void setContentReference(ContentReference contentReference) {
        this.contentReference = contentReference;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}