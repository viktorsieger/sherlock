package se.umu.cs.githubtypes;

public class EnterpriseServerInstallationOrder {

    private OrderDirection direction;
    private EnterpriseServerInstallationOrderField field;

    public EnterpriseServerInstallationOrder() {
    }

    public EnterpriseServerInstallationOrder(OrderDirection direction, EnterpriseServerInstallationOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public EnterpriseServerInstallationOrderField getField() {
        return field;
    }
    public void setField(EnterpriseServerInstallationOrderField field) {
        this.field = field;
    }

}