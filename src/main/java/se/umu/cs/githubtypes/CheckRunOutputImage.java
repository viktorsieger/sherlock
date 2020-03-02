package se.umu.cs.githubtypes;

public class CheckRunOutputImage {

    private String alt;
    private String caption;
    private String imageUrl;

    public CheckRunOutputImage() {
    }

    public CheckRunOutputImage(String alt, String caption, String imageUrl) {
        this.alt = alt;
        this.caption = caption;
        this.imageUrl = imageUrl;
    }

    public String getAlt() {
        return alt;
    }
    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}