package se.umu.cs.githubtypes;

public class Release implements Node, UniformResourceLocatable{

    private User author;
    private String createdAt;
    private String description;
    private String descriptionHTML;
    private String id;
    private Boolean isDraft;
    private Boolean isPrerelease;
    private String name;
    private String publishedAt;
    private ReleaseAssetConnection releaseAssets;
    private String resourcePath;
    private String shortDescriptionHTML;
    private Ref tag;
    private String tagName;
    private String updatedAt;
    private String url;

    public Release() {
    }

    public Release(User author, String createdAt, String description, String descriptionHTML, String id, Boolean isDraft, Boolean isPrerelease, String name, String publishedAt, ReleaseAssetConnection releaseAssets, String resourcePath, String shortDescriptionHTML, Ref tag, String tagName, String updatedAt, String url) {
        this.author = author;
        this.createdAt = createdAt;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.id = id;
        this.isDraft = isDraft;
        this.isPrerelease = isPrerelease;
        this.name = name;
        this.publishedAt = publishedAt;
        this.releaseAssets = releaseAssets;
        this.resourcePath = resourcePath;
        this.shortDescriptionHTML = shortDescriptionHTML;
        this.tag = tag;
        this.tagName = tagName;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }
    public void setDescriptionHTML(String descriptionHTML) {
        this.descriptionHTML = descriptionHTML;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }
    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }

    public Boolean getIsPrerelease() {
        return isPrerelease;
    }
    public void setIsPrerelease(Boolean isPrerelease) {
        this.isPrerelease = isPrerelease;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public ReleaseAssetConnection getReleaseAssets() {
        return releaseAssets;
    }
    public void setReleaseAssets(ReleaseAssetConnection releaseAssets) {
        this.releaseAssets = releaseAssets;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getShortDescriptionHTML() {
        return shortDescriptionHTML;
    }
    public void setShortDescriptionHTML(String shortDescriptionHTML) {
        this.shortDescriptionHTML = shortDescriptionHTML;
    }

    public Ref getTag() {
        return tag;
    }
    public void setTag(Ref tag) {
        this.tag = tag;
    }

    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}