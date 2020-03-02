package se.umu.cs.githubtypes;

public class GistFile {

    private String encodedName;
    private String encoding;
    private String extension;
    private Boolean isImage;
    private Boolean isTruncated;
    private Language language;
    private String name;
    private Integer size;
    private String text;

    public GistFile() {
    }

    public GistFile(String encodedName, String encoding, String extension, Boolean isImage, Boolean isTruncated, Language language, String name, Integer size, String text) {
        this.encodedName = encodedName;
        this.encoding = encoding;
        this.extension = extension;
        this.isImage = isImage;
        this.isTruncated = isTruncated;
        this.language = language;
        this.name = name;
        this.size = size;
        this.text = text;
    }

    public String getEncodedName() {
        return encodedName;
    }
    public void setEncodedName(String encodedName) {
        this.encodedName = encodedName;
    }

    public String getEncoding() {
        return encoding;
    }
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Boolean getIsImage() {
        return isImage;
    }
    public void setIsImage(Boolean isImage) {
        this.isImage = isImage;
    }

    public Boolean getIsTruncated() {
        return isTruncated;
    }
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    public Language getLanguage() {
        return language;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

}