package se.umu.cs.githubtypes;

public class DeploymentOrder {

    private OrderDirection direction;
    private DeploymentOrderField field;

    public DeploymentOrder() {
    }

    public DeploymentOrder(OrderDirection direction, DeploymentOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public DeploymentOrderField getField() {
        return field;
    }
    public void setField(DeploymentOrderField field) {
        this.field = field;
    }

}