package se.umu.cs.githubtypes;

public class CloneProjectPayload {

    private String clientMutationId;
    private String jobStatusId;
    private Project project;

    public CloneProjectPayload() {
    }

    public CloneProjectPayload(String clientMutationId, String jobStatusId, Project project) {
        this.clientMutationId = clientMutationId;
        this.jobStatusId = jobStatusId;
        this.project = project;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getJobStatusId() {
        return jobStatusId;
    }
    public void setJobStatusId(String jobStatusId) {
        this.jobStatusId = jobStatusId;
    }

    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }

}