package se.umu.cs.githubtypes;

public class CheckAnnotationData {

    private CheckAnnotationLevel annotationLevel;
    private CheckAnnotationRange location;
    private String message;
    private String path;
    private String rawDetails;
    private String title;

    public CheckAnnotationData() {
    }

    public CheckAnnotationData(CheckAnnotationLevel annotationLevel, CheckAnnotationRange location, String message, String path, String rawDetails, String title) {
        this.annotationLevel = annotationLevel;
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

    public CheckAnnotationRange getLocation() {
        return location;
    }
    public void setLocation(CheckAnnotationRange location) {
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