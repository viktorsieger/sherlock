package se.umu.cs.githubtypes;

public class OrgRestoreMemberMembershipTeamAuditEntryData implements OrgRestoreMemberAuditEntryMembership, TeamAuditEntryData{

    private Team team;
    private String teamName;
    private String teamResourcePath;
    private String teamUrl;

    public OrgRestoreMemberMembershipTeamAuditEntryData() {
    }

    public OrgRestoreMemberMembershipTeamAuditEntryData(Team team, String teamName, String teamResourcePath, String teamUrl) {
        this.team = team;
        this.teamName = teamName;
        this.teamResourcePath = teamResourcePath;
        this.teamUrl = teamUrl;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamResourcePath() {
        return teamResourcePath;
    }
    public void setTeamResourcePath(String teamResourcePath) {
        this.teamResourcePath = teamResourcePath;
    }

    public String getTeamUrl() {
        return teamUrl;
    }
    public void setTeamUrl(String teamUrl) {
        this.teamUrl = teamUrl;
    }

}