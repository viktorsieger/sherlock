package se.umu.cs.githubtypes;

public class SecurityAdvisoryReference {

    private String url;

    public SecurityAdvisoryReference() {
    }

    public SecurityAdvisoryReference(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}