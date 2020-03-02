package se.umu.cs.githubtypes;

public class ReleaseAsset implements Node{

    private String contentType;
    private String createdAt;
    private Integer downloadCount;
    private String downloadUrl;
    private String id;
    private String name;
    private Release release;
    private Integer size;
    private String updatedAt;
    private User uploadedBy;
    private String url;

    public ReleaseAsset() {
    }

    public ReleaseAsset(String contentType, String createdAt, Integer downloadCount, String downloadUrl, String id, String name, Release release, Integer size, String updatedAt, User uploadedBy, String url) {
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.downloadCount = downloadCount;
        this.downloadUrl = downloadUrl;
        this.id = id;
        this.name = name;
        this.release = release;
        this.size = size;
        this.updatedAt = updatedAt;
        this.uploadedBy = uploadedBy;
        this.url = url;
    }

    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Release getRelease() {
        return release;
    }
    public void setRelease(Release release) {
        this.release = release;
    }

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUploadedBy() {
        return uploadedBy;
    }
    public void setUploadedBy(User uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}