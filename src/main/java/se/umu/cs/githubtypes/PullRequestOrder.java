package se.umu.cs.githubtypes;

public class PullRequestOrder {

    private OrderDirection direction;
    private PullRequestOrderField field;

    public PullRequestOrder() {
    }

    public PullRequestOrder(OrderDirection direction, PullRequestOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public PullRequestOrderField getField() {
        return field;
    }
    public void setField(PullRequestOrderField field) {
        this.field = field;
    }

}