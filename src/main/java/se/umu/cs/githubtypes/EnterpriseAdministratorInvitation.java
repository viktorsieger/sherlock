package se.umu.cs.githubtypes;

public class EnterpriseAdministratorInvitation implements Node{

    private String createdAt;
    private String email;
    private Enterprise enterprise;
    private String id;
    private User invitee;
    private User inviter;
    private EnterpriseAdministratorRole role;

    public EnterpriseAdministratorInvitation() {
    }

    public EnterpriseAdministratorInvitation(String createdAt, String email, Enterprise enterprise, String id, User invitee, User inviter, EnterpriseAdministratorRole role) {
        this.createdAt = createdAt;
        this.email = email;
        this.enterprise = enterprise;
        this.id = id;
        this.invitee = invitee;
        this.inviter = inviter;
        this.role = role;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public User getInvitee() {
        return invitee;
    }
    public void setInvitee(User invitee) {
        this.invitee = invitee;
    }

    public User getInviter() {
        return inviter;
    }
    public void setInviter(User inviter) {
        this.inviter = inviter;
    }

    public EnterpriseAdministratorRole getRole() {
        return role;
    }
    public void setRole(EnterpriseAdministratorRole role) {
        this.role = role;
    }

}