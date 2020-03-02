package se.umu.cs.githubtypes;

public class AddProjectCardInput {

    private String clientMutationId;
    private String contentId;
    private String note;
    private String projectColumnId;

    public AddProjectCardInput() {
    }

    public AddProjectCardInput(String clientMutationId, String contentId, String note, String projectColumnId) {
        this.clientMutationId = clientMutationId;
        this.contentId = contentId;
        this.note = note;
        this.projectColumnId = projectColumnId;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getContentId() {
        return contentId;
    }
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getProjectColumnId() {
        return projectColumnId;
    }
    public void setProjectColumnId(String projectColumnId) {
        this.projectColumnId = projectColumnId;
    }

}