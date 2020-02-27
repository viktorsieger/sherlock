package se.umu.cs.graphql;

import java.util.*;

public class UpdateCheckRunInput {

    private Collection<CheckRunAction> actions;
    private String checkRunId;
    private String clientMutationId;
    private String completedAt;
    private CheckConclusionState conclusion;
    private String detailsUrl;
    private String externalId;
    private String name;
    private CheckRunOutput output;
    private String repositoryId;
    private String startedAt;
    private RequestableCheckStatusState status;

    public UpdateCheckRunInput() {
    }

    public UpdateCheckRunInput(Collection<CheckRunAction> actions, String checkRunId, String clientMutationId, String completedAt, CheckConclusionState conclusion, String detailsUrl, String externalId, String name, CheckRunOutput output, String repositoryId, String startedAt, RequestableCheckStatusState status) {
        this.actions = actions;
        this.checkRunId = checkRunId;
        this.clientMutationId = clientMutationId;
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.name = name;
        this.output = output;
        this.repositoryId = repositoryId;
        this.startedAt = startedAt;
        this.status = status;
    }

    public Collection<CheckRunAction> getActions() {
        return actions;
    }
    public void setActions(Collection<CheckRunAction> actions) {
        this.actions = actions;
    }

    public String getCheckRunId() {
        return checkRunId;
    }
    public void setCheckRunId(String checkRunId) {
        this.checkRunId = checkRunId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public CheckRunOutput getOutput() {
        return output;
    }
    public void setOutput(CheckRunOutput output) {
        this.output = output;
    }

    public String getRepositoryId() {
        return repositoryId;
    }
    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getStartedAt() {
        return startedAt;
    }
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public RequestableCheckStatusState getStatus() {
        return status;
    }
    public void setStatus(RequestableCheckStatusState status) {
        this.status = status;
    }

}