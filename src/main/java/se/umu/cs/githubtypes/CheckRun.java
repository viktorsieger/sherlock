package se.umu.cs.githubtypes;

public class CheckRun implements Node, UniformResourceLocatable{

    private CheckAnnotationConnection annotations;
    private CheckSuite checkSuite;
    private String completedAt;
    private CheckConclusionState conclusion;
    private Integer databaseId;
    private String detailsUrl;
    private String externalId;
    private String id;
    private String name;
    private String permalink;
    private Repository repository;
    private String resourcePath;
    private String startedAt;
    private CheckStatusState status;
    private String summary;
    private String text;
    private String title;
    private String url;

    public CheckRun() {
    }

    public CheckRun(CheckAnnotationConnection annotations, CheckSuite checkSuite, String completedAt, CheckConclusionState conclusion, Integer databaseId, String detailsUrl, String externalId, String id, String name, String permalink, Repository repository, String resourcePath, String startedAt, CheckStatusState status, String summary, String text, String title, String url) {
        this.annotations = annotations;
        this.checkSuite = checkSuite;
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.databaseId = databaseId;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.id = id;
        this.name = name;
        this.permalink = permalink;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.startedAt = startedAt;
        this.status = status;
        this.summary = summary;
        this.text = text;
        this.title = title;
        this.url = url;
    }

    public CheckAnnotationConnection getAnnotations() {
        return annotations;
    }
    public void setAnnotations(CheckAnnotationConnection annotations) {
        this.annotations = annotations;
    }

    public CheckSuite getCheckSuite() {
        return checkSuite;
    }
    public void setCheckSuite(CheckSuite checkSuite) {
        this.checkSuite = checkSuite;
    }

    public String getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public CheckConclusionState getConclusion() {
        return conclusion;
    }
    public void setConclusion(CheckConclusionState conclusion) {
        this.conclusion = conclusion;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public String getPermalink() {
        return permalink;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public CheckStatusState getStatus() {
        return status;
    }
    public void setStatus(CheckStatusState status) {
        this.status = status;
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

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

}