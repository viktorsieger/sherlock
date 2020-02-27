package se.umu.cs.graphql;

import java.util.*;

public class UpdateIssueInput {

    private Collection<String> assigneeIds;
    private String body;
    private String clientMutationId;
    private String id;
    private Collection<String> labelIds;
    private String milestoneId;
    private Collection<String> projectIds;
    private IssueState state;
    private String title;

    public UpdateIssueInput() {
    }

    public UpdateIssueInput(Collection<String> assigneeIds, String body, String clientMutationId, String id, Collection<String> labelIds, String milestoneId, Collection<String> projectIds, IssueState state, String title) {
        this.assigneeIds = assigneeIds;
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.id = id;
        this.labelIds = labelIds;
        this.milestoneId = milestoneId;
        this.projectIds = projectIds;
        this.state = state;
        this.title = title;
    }

    public Collection<String> getAssigneeIds() {
        return assigneeIds;
    }
    public void setAssigneeIds(Collection<String> assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Collection<String> getLabelIds() {
        return labelIds;
    }
    public void setLabelIds(Collection<String> labelIds) {
        this.labelIds = labelIds;
    }

    public String getMilestoneId() {
        return milestoneId;
    }
    public void setMilestoneId(String milestoneId) {
        this.milestoneId = milestoneId;
    }

    public Collection<String> getProjectIds() {
        return projectIds;
    }
    public void setProjectIds(Collection<String> projectIds) {
        this.projectIds = projectIds;
    }

    public IssueState getState() {
        return state;
    }
    public void setState(IssueState state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}