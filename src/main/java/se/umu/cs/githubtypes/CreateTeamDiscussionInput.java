package se.umu.cs.githubtypes;

public class CreateTeamDiscussionInput {

    private String body;
    private String clientMutationId;
    private Boolean Private;
    private String teamId;
    private String title;

    public CreateTeamDiscussionInput() {
    }

    public CreateTeamDiscussionInput(String body, String clientMutationId, Boolean Private, String teamId, String title) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.Private = Private;
        this.teamId = teamId;
        this.title = title;
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

    public Boolean getPrivate() {
        return Private;
    }
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    public String getTeamId() {
        return teamId;
    }
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}