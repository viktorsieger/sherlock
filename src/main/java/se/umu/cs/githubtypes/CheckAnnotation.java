package se.umu.cs.githubtypes;

public class CheckAnnotation {

    private CheckAnnotationLevel annotationLevel;
    private String blobUrl;
    private Integer databaseId;
    private CheckAnnotationSpan location;
    private String message;
    private String path;
    private String rawDetails;
    private String title;

    public CheckAnnotation() {
    }

    public CheckAnnotation(CheckAnnotationLevel annotationLevel, String blobUrl, Integer databaseId, CheckAnnotationSpan location, String message, String path, String rawDetails, String title) {
        this.annotationLevel = annotationLevel;
        this.blobUrl = blobUrl;
        this.databaseId = databaseId;
        this.location = location;
        this.message = message;
        this.path = path;
        this.rawDetails = rawDetails;
        this.title = title;
    }

    public CheckAnnotationLevel getAnnotationLevel() {
        return annotationLevel;
    }
    public void setAnnotationLevel(CheckAnnotationLevel annotationLevel) {
        this.annotationLevel = annotationLevel;
    }

    public String getBlobUrl() {
        return blobUrl;
    }
    public void setBlobUrl(String blobUrl) {
        this.blobUrl = blobUrl;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public CheckAnnotationSpan getLocation() {
        return location;
    }
    public void setLocation(CheckAnnotationSpan location) {
        this.location = location;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }

    public String getRawDetails() {
        return rawDetails;
    }
    public void setRawDetails(String rawDetails) {
        this.rawDetails = rawDetails;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}