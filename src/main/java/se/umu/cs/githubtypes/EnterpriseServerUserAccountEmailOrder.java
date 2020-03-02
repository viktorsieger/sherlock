package se.umu.cs.githubtypes;

public class EnterpriseServerUserAccountEmailOrder {

    private OrderDirection direction;
    private EnterpriseServerUserAccountEmailOrderField field;

    public EnterpriseServerUserAccountEmailOrder() {
    }

    public EnterpriseServerUserAccountEmailOrder(OrderDirection direction, EnterpriseServerUserAccountEmailOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public EnterpriseServerUserAccountEmailOrderField getField() {
        return field;
    }
    public void setField(EnterpriseServerUserAccountEmailOrderField field) {
        this.field = field;
    }

}