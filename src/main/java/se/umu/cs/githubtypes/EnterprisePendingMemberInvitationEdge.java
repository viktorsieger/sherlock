package se.umu.cs.githubtypes;

public class EnterprisePendingMemberInvitationEdge {

    private String cursor;
    private Boolean isUnlicensed;
    private OrganizationInvitation node;

    public EnterprisePendingMemberInvitationEdge() {
    }

    public EnterprisePendingMemberInvitationEdge(String cursor, Boolean isUnlicensed, OrganizationInvitation node) {
        this.cursor = cursor;
        this.isUnlicensed = isUnlicensed;
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getIsUnlicensed() {
        return isUnlicensed;
    }
    public void setIsUnlicensed(Boolean isUnlicensed) {
        this.isUnlicensed = isUnlicensed;
    }

    public OrganizationInvitation getNode() {
        return node;
    }
    public void setNode(OrganizationInvitation node) {
        this.node = node;
    }

}