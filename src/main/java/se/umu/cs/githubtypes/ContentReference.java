package se.umu.cs.githubtypes;

public class ContentReference {

    private Integer databaseId;
    private String id;
    private String reference;

    public ContentReference() {
    }

    public ContentReference(Integer databaseId, String id, String reference) {
        this.databaseId = databaseId;
        this.id = id;
        this.reference = reference;
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

    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

}