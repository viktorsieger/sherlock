package se.umu.cs.githubtypes;

public class ContributionOrder {

    private OrderDirection direction;
    private ContributionOrderField field;

    public ContributionOrder() {
    }

    public ContributionOrder(OrderDirection direction, ContributionOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public ContributionOrderField getField() {
        return field;
    }
    public void setField(ContributionOrderField field) {
        this.field = field;
    }

}