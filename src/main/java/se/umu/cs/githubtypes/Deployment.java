package se.umu.cs.githubtypes;

public class Deployment implements Node{

    private Commit commit;
    private String commitOid;
    private String createdAt;
    private Actor creator;
    private Integer databaseId;
    private String description;
    private String environment;
    private String id;
    private String latestEnvironment;
    private DeploymentStatus latestStatus;
    private String originalEnvironment;
    private String payload;
    private Ref ref;
    private Repository repository;
    private DeploymentState state;
    private DeploymentStatusConnection statuses;
    private String task;
    private String updatedAt;

    public Deployment() {
    }

    public Deployment(Commit commit, String commitOid, String createdAt, Actor creator, Integer databaseId, String description, String environment, String id, String latestEnvironment, DeploymentStatus latestStatus, String originalEnvironment, String payload, Ref ref, Repository repository, DeploymentState state, DeploymentStatusConnection statuses, String task, String updatedAt) {
        this.commit = commit;
        this.commitOid = commitOid;
        this.createdAt = createdAt;
        this.creator = creator;
        this.databaseId = databaseId;
        this.description = description;
        this.environment = environment;
        this.id = id;
        this.latestEnvironment = latestEnvironment;
        this.latestStatus = latestStatus;
        this.originalEnvironment = originalEnvironment;
        this.payload = payload;
        this.ref = ref;
        this.repository = repository;
        this.state = state;
        this.statuses = statuses;
        this.task = task;
        this.updatedAt = updatedAt;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getCommitOid() {
        return commitOid;
    }
    public void setCommitOid(String commitOid) {
        this.commitOid = commitOid;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Actor getCreator() {
        return creator;
    }
    public void setCreator(Actor creator) {
        this.creator = creator;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }
    public void setDatabaseId(Integer databaseId) {
        this.databaseId = databaseId;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLatestEnvironment() {
        return latestEnvironment;
    }
    public void setLatestEnvironment(String latestEnvironment) {
        this.latestEnvironment = latestEnvironment;
    }

    public DeploymentStatus getLatestStatus() {
        return latestStatus;
    }
    public void setLatestStatus(DeploymentStatus latestStatus) {
        this.latestStatus = latestStatus;
    }

    public String getOriginalEnvironment() {
        return originalEnvironment;
    }
    public void setOriginalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
    }

    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Ref getRef() {
        return ref;
    }
    public void setRef(Ref ref) {
        this.ref = ref;
    }

    public Repository getRepository() {
        return repository;
    }
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public DeploymentState getState() {
        return state;
    }
    public void setState(DeploymentState state) {
        this.state = state;
    }

    public DeploymentStatusConnection getStatuses() {
        return statuses;
    }
    public void setStatuses(DeploymentStatusConnection statuses) {
        this.statuses = statuses;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}