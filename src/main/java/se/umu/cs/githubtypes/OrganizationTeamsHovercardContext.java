package se.umu.cs.githubtypes;

public class OrganizationTeamsHovercardContext implements HovercardContext{

    private String message;
    private String octicon;
    private TeamConnection relevantTeams;
    private String teamsResourcePath;
    private String teamsUrl;
    private Integer totalTeamCount;

    public OrganizationTeamsHovercardContext() {
    }

    public OrganizationTeamsHovercardContext(String message, String octicon, TeamConnection relevantTeams, String teamsResourcePath, String teamsUrl, Integer totalTeamCount) {
        this.message = message;
        this.octicon = octicon;
        this.relevantTeams = relevantTeams;
        this.teamsResourcePath = teamsResourcePath;
        this.teamsUrl = teamsUrl;
        this.totalTeamCount = totalTeamCount;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOcticon() {
        return octicon;
    }
    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

    public TeamConnection getRelevantTeams() {
        return relevantTeams;
    }
    public void setRelevantTeams(TeamConnection relevantTeams) {
        this.relevantTeams = relevantTeams;
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

    public Integer getTotalTeamCount() {
        return totalTeamCount;
    }
    public void setTotalTeamCount(Integer totalTeamCount) {
        this.totalTeamCount = totalTeamCount;
    }

}