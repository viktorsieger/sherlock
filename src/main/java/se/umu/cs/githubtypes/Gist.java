package se.umu.cs.githubtypes;

import java.util.Collection;

public class Gist implements PinnableItem, Node, Starrable, UniformResourceLocatable{

    private GistCommentConnection comments;
    private String createdAt;
    private String description;
    private Collection<GistFile> files;
    private GistConnection forks;
    private String id;
    private Boolean isFork;
    private Boolean isPublic;
    private String name;
    private RepositoryOwner owner;
    private String pushedAt;
    private String resourcePath;
    private StargazerConnection stargazers;
    private String updatedAt;
    private String url;
    private Boolean viewerHasStarred;

    public Gist() {
    }

    public Gist(GistCommentConnection comments, String createdAt, String description, Collection<GistFile> files, GistConnection forks, String id, Boolean isFork, Boolean isPublic, String name, RepositoryOwner owner, String pushedAt, String resourcePath, StargazerConnection stargazers, String updatedAt, String url, Boolean viewerHasStarred) {
        this.comments = comments;
        this.createdAt = createdAt;
        this.description = description;
        this.files = files;
        this.forks = forks;
        this.id = id;
        this.isFork = isFork;
        this.isPublic = isPublic;
        this.name = name;
        this.owner = owner;
        this.pushedAt = pushedAt;
        this.resourcePath = resourcePath;
        this.stargazers = stargazers;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerHasStarred = viewerHasStarred;
    }

    public GistCommentConnection getComments() {
        return comments;
    }
    public void setComments(GistCommentConnection comments) {
        this.comments = comments;
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

    public Collection<GistFile> getFiles() {
        return files;
    }
    public void setFiles(Collection<GistFile> files) {
        this.files = files;
    }

    public GistConnection getForks() {
        return forks;
    }
    public void setForks(GistConnection forks) {
        this.forks = forks;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsFork() {
        return isFork;
    }
    public void setIsFork(Boolean isFork) {
        this.isFork = isFork;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public RepositoryOwner getOwner() {
        return owner;
    }
    public void setOwner(RepositoryOwner owner) {
        this.owner = owner;
    }

    public String getPushedAt() {
        return pushedAt;
    }
    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public StargazerConnection getStargazers() {
        return stargazers;
    }
    public void setStargazers(StargazerConnection stargazers) {
        this.stargazers = stargazers;
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

    public Boolean getViewerHasStarred() {
        return viewerHasStarred;
    }
    public void setViewerHasStarred(Boolean viewerHasStarred) {
        this.viewerHasStarred = viewerHasStarred;
    }

}