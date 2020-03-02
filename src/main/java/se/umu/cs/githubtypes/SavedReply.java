package se.umu.cs.githubtypes;

public class SavedReply implements Node{

    private String body;
    private String bodyHTML;
    private Integer databaseId;
    private String id;
    private String title;
    private Actor user;

    public SavedReply() {
    }

    public SavedReply(String body, String bodyHTML, Integer databaseId, String id, String title, Actor user) {
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.databaseId = databaseId;
        this.id = id;
        this.title = title;
        this.user = user;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }
    public void setBodyHTML(String bodyHTML) {
        this.bodyHTML = bodyHTML;
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

    public Actor getUser() {
        return user;
    }
    public void setUser(Actor user) {
        this.user = user;
    }

}