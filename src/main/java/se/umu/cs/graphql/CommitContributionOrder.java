package se.umu.cs.graphql;

import java.util.*;

public class CommitContributionOrder {

    private OrderDirection direction;
    private CommitContributionOrderField field;

    public CommitContributionOrder() {
    }

    public CommitContributionOrder(OrderDirection direction, CommitContributionOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public CommitContributionOrderField getField() {
        return field;
    }
    public void setField(CommitContributionOrderField field) {
        this.field = field;
    }

}