package se.umu.cs.githubtypes;

public class EnterpriseAdministratorInvitationOrder {

    private OrderDirection direction;
    private EnterpriseAdministratorInvitationOrderField field;

    public EnterpriseAdministratorInvitationOrder() {
    }

    public EnterpriseAdministratorInvitationOrder(OrderDirection direction, EnterpriseAdministratorInvitationOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public EnterpriseAdministratorInvitationOrderField getField() {
        return field;
    }
    public void setField(EnterpriseAdministratorInvitationOrderField field) {
        this.field = field;
    }

}