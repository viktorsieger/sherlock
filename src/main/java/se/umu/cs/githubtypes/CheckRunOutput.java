package se.umu.cs.githubtypes;

import java.util.Collection;

public class CheckRunOutput {

    private Collection<CheckAnnotationData> annotations;
    private Collection<CheckRunOutputImage> images;
    private String summary;
    private String text;
    private String title;

    public CheckRunOutput() {
    }

    public CheckRunOutput(Collection<CheckAnnotationData> annotations, Collection<CheckRunOutputImage> images, String summary, String text, String title) {
        this.annotations = annotations;
        this.images = images;
        this.summary = summary;
        this.text = text;
        this.title = title;
    }

    public Collection<CheckAnnotationData> getAnnotations() {
        return annotations;
    }
    public void setAnnotations(Collection<CheckAnnotationData> annotations) {
        this.annotations = annotations;
    }

    public Collection<CheckRunOutputImage> getImages() {
        return images;
    }
    public void setImages(Collection<CheckRunOutputImage> images) {
        this.images = images;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}