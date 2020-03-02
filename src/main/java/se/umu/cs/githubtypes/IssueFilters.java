package se.umu.cs.githubtypes;

import java.util.Collection;

public class IssueFilters {

    private String assignee;
    private String createdBy;
    private Collection<String> labels;
    private String mentioned;
    private String milestone;
    private String since;
    private Collection<IssueState> states;
    private Boolean viewerSubscribed;

    public IssueFilters() {
    }

    public IssueFilters(String assignee, String createdBy, Collection<String> labels, String mentioned, String milestone, String since, Collection<IssueState> states, Boolean viewerSubscribed) {
        this.assignee = assignee;
        this.createdBy = createdBy;
        this.labels = labels;
        this.mentioned = mentioned;
        this.milestone = milestone;
        this.since = since;
        this.states = states;
        this.viewerSubscribed = viewerSubscribed;
    }

    public String getAssignee() {
        return assignee;
    }
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Collection<String> getLabels() {
        return labels;
    }
    public void setLabels(Collection<String> labels) {
        this.labels = labels;
    }

    public String getMentioned() {
        return mentioned;
    }
    public void setMentioned(String mentioned) {
        this.mentioned = mentioned;
    }

    public String getMilestone() {
        return milestone;
    }
    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getSince() {
        return since;
    }
    public void setSince(String since) {
        this.since = since;
    }

    public Collection<IssueState> getStates() {
        return states;
    }
    public void setStates(Collection<IssueState> states) {
        this.states = states;
    }

    public Boolean getViewerSubscribed() {
        return viewerSubscribed;
    }
    public void setViewerSubscribed(Boolean viewerSubscribed) {
        this.viewerSubscribed = viewerSubscribed;
    }

}