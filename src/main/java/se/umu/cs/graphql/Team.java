package se.umu.cs.graphql;

import java.util.*;

public class Team implements PermissionGranter, PushAllowanceActor, RequestedReviewer, ReviewDismissalAllowanceActor, MemberStatusable, Node, Subscribable{

    private TeamConnection ancestors;
    private String avatarUrl;
    private TeamConnection childTeams;
    private String combinedSlug;
    private String createdAt;
    private String description;
    private TeamDiscussion discussion;
    private TeamDiscussionConnection discussions;
    private String discussionsResourcePath;
    private String discussionsUrl;
    private String editTeamResourcePath;
    private String editTeamUrl;
    private String id;
    private OrganizationInvitationConnection invitations;
    private UserStatusConnection memberStatuses;
    private TeamMemberConnection members;
    private String membersResourcePath;
    private String membersUrl;
    private String name;
    private String newTeamResourcePath;
    private String newTeamUrl;
    private Organization organization;
    private Team parentTeam;
    private TeamPrivacy privacy;
    private TeamRepositoryConnection repositories;
    private String repositoriesResourcePath;
    private String repositoriesUrl;
    private String resourcePath;
    private TeamReviewAssignmentAlgorithm reviewRequestDelegationAlgorithm;
    private Boolean reviewRequestDelegationEnabled;
    private Integer reviewRequestDelegationMemberCount;
    private Boolean reviewRequestDelegationNotifyTeam;
    private String slug;
    private String teamsResourcePath;
    private String teamsUrl;
    private String updatedAt;
    private String url;
    private Boolean viewerCanAdminister;
    private Boolean viewerCanSubscribe;
    private SubscriptionState viewerSubscription;

    public Team() {
    }

    public Team(TeamConnection ancestors, String avatarUrl, TeamConnection childTeams, String combinedSlug, String createdAt, String description, TeamDiscussion discussion, TeamDiscussionConnection discussions, String discussionsResourcePath, String discussionsUrl, String editTeamResourcePath, String editTeamUrl, String id, OrganizationInvitationConnection invitations, UserStatusConnection memberStatuses, TeamMemberConnection members, String membersResourcePath, String membersUrl, String name, String newTeamResourcePath, String newTeamUrl, Organization organization, Team parentTeam, TeamPrivacy privacy, TeamRepositoryConnection repositories, String repositoriesResourcePath, String repositoriesUrl, String resourcePath, TeamReviewAssignmentAlgorithm reviewRequestDelegationAlgorithm, Boolean reviewRequestDelegationEnabled, Integer reviewRequestDelegationMemberCount, Boolean reviewRequestDelegationNotifyTeam, String slug, String teamsResourcePath, String teamsUrl, String updatedAt, String url, Boolean viewerCanAdminister, Boolean viewerCanSubscribe, SubscriptionState viewerSubscription) {
        this.ancestors = ancestors;
        this.avatarUrl = avatarUrl;
        this.childTeams = childTeams;
        this.combinedSlug = combinedSlug;
        this.createdAt = createdAt;
        this.description = description;
        this.discussion = discussion;
        this.discussions = discussions;
        this.discussionsResourcePath = discussionsResourcePath;
        this.discussionsUrl = discussionsUrl;
        this.editTeamResourcePath = editTeamResourcePath;
        this.editTeamUrl = editTeamUrl;
        this.id = id;
        this.invitations = invitations;
        this.memberStatuses = memberStatuses;
        this.members = members;
        this.membersResourcePath = membersResourcePath;
        this.membersUrl = membersUrl;
        this.name = name;
        this.newTeamResourcePath = newTeamResourcePath;
        this.newTeamUrl = newTeamUrl;
        this.organization = organization;
        this.parentTeam = parentTeam;
        this.privacy = privacy;
        this.repositories = repositories;
        this.repositoriesResourcePath = repositoriesResourcePath;
        this.repositoriesUrl = repositoriesUrl;
        this.resourcePath = resourcePath;
        this.reviewRequestDelegationAlgorithm = reviewRequestDelegationAlgorithm;
        this.reviewRequestDelegationEnabled = reviewRequestDelegationEnabled;
        this.reviewRequestDelegationMemberCount = reviewRequestDelegationMemberCount;
        this.reviewRequestDelegationNotifyTeam = reviewRequestDelegationNotifyTeam;
        this.slug = slug;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerSubscription = viewerSubscription;
    }

    public TeamConnection getAncestors() {
        return ancestors;
    }
    public void setAncestors(TeamConnection ancestors) {
        this.ancestors = ancestors;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public TeamConnection getChildTeams() {
        return childTeams;
    }
    public void setChildTeams(TeamConnection childTeams) {
        this.childTeams = childTeams;
    }

    public String getCombinedSlug() {
        return combinedSlug;
    }
    public void setCombinedSlug(String combinedSlug) {
        this.combinedSlug = combinedSlug;
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

    public TeamDiscussion getDiscussion() {
        return discussion;
    }
    public void setDiscussion(TeamDiscussion discussion) {
        this.discussion = discussion;
    }

    public TeamDiscussionConnection getDiscussions() {
        return discussions;
    }
    public void setDiscussions(TeamDiscussionConnection discussions) {
        this.discussions = discussions;
    }

    public String getDiscussionsResourcePath() {
        return discussionsResourcePath;
    }
    public void setDiscussionsResourcePath(String discussionsResourcePath) {
        this.discussionsResourcePath = discussionsResourcePath;
    }

    public String getDiscussionsUrl() {
        return discussionsUrl;
    }
    public void setDiscussionsUrl(String discussionsUrl) {
        this.discussionsUrl = discussionsUrl;
    }

    public String getEditTeamResourcePath() {
        return editTeamResourcePath;
    }
    public void setEditTeamResourcePath(String editTeamResourcePath) {
        this.editTeamResourcePath = editTeamResourcePath;
    }

    public String getEditTeamUrl() {
        return editTeamUrl;
    }
    public void setEditTeamUrl(String editTeamUrl) {
        this.editTeamUrl = editTeamUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OrganizationInvitationConnection getInvitations() {
        return invitations;
    }
    public void setInvitations(OrganizationInvitationConnection invitations) {
        this.invitations = invitations;
    }

    public UserStatusConnection getMemberStatuses() {
        return memberStatuses;
    }
    public void setMemberStatuses(UserStatusConnection memberStatuses) {
        this.memberStatuses = memberStatuses;
    }

    public TeamMemberConnection getMembers() {
        return members;
    }
    public void setMembers(TeamMemberConnection members) {
        this.members = members;
    }

    public String getMembersResourcePath() {
        return membersResourcePath;
    }
    public void setMembersResourcePath(String membersResourcePath) {
        this.membersResourcePath = membersResourcePath;
    }

    public String getMembersUrl() {
        return membersUrl;
    }
    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNewTeamResourcePath() {
        return newTeamResourcePath;
    }
    public void setNewTeamResourcePath(String newTeamResourcePath) {
        this.newTeamResourcePath = newTeamResourcePath;
    }

    public String getNewTeamUrl() {
        return newTeamUrl;
    }
    public void setNewTeamUrl(String newTeamUrl) {
        this.newTeamUrl = newTeamUrl;
    }

    public Organization getOrganization() {
        return organization;
    }
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Team getParentTeam() {
        return parentTeam;
    }
    public void setParentTeam(Team parentTeam) {
        this.parentTeam = parentTeam;
    }

    public TeamPrivacy getPrivacy() {
        return privacy;
    }
    public void setPrivacy(TeamPrivacy privacy) {
        this.privacy = privacy;
    }

    public TeamRepositoryConnection getRepositories() {
        return repositories;
    }
    public void setRepositories(TeamRepositoryConnection repositories) {
        this.repositories = repositories;
    }

    public String getRepositoriesResourcePath() {
        return repositoriesResourcePath;
    }
    public void setRepositoriesResourcePath(String repositoriesResourcePath) {
        this.repositoriesResourcePath = repositoriesResourcePath;
    }

    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }
    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public TeamReviewAssignmentAlgorithm getReviewRequestDelegationAlgorithm() {
        return reviewRequestDelegationAlgorithm;
    }
    public void setReviewRequestDelegationAlgorithm(TeamReviewAssignmentAlgorithm reviewRequestDelegationAlgorithm) {
        this.reviewRequestDelegationAlgorithm = reviewRequestDelegationAlgorithm;
    }

    public Boolean getReviewRequestDelegationEnabled() {
        return reviewRequestDelegationEnabled;
    }
    public void setReviewRequestDelegationEnabled(Boolean reviewRequestDelegationEnabled) {
        this.reviewRequestDelegationEnabled = reviewRequestDelegationEnabled;
    }

    public Integer getReviewRequestDelegationMemberCount() {
        return reviewRequestDelegationMemberCount;
    }
    public void setReviewRequestDelegationMemberCount(Integer reviewRequestDelegationMemberCount) {
        this.reviewRequestDelegationMemberCount = reviewRequestDelegationMemberCount;
    }

    public Boolean getReviewRequestDelegationNotifyTeam() {
        return reviewRequestDelegationNotifyTeam;
    }
    public void setReviewRequestDelegationNotifyTeam(Boolean reviewRequestDelegationNotifyTeam) {
        this.reviewRequestDelegationNotifyTeam = reviewRequestDelegationNotifyTeam;
    }

    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTeamsResourcePath() {
        return teamsResourcePath;
    }
    public void setTeamsResourcePath(String teamsResourcePath) {
        this.teamsResourcePath = teamsResourcePath;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }
    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
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

    public Boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }
    public void setViewerCanAdminister(Boolean viewerCanAdminister) {
        this.viewerCanAdminister = viewerCanAdminister;
    }

    public Boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }
    public void setViewerCanSubscribe(Boolean viewerCanSubscribe) {
        this.viewerCanSubscribe = viewerCanSubscribe;
    }

    public SubscriptionState getViewerSubscription() {
        return viewerSubscription;
    }
    public void setViewerSubscription(SubscriptionState viewerSubscription) {
        this.viewerSubscription = viewerSubscription;
    }

}