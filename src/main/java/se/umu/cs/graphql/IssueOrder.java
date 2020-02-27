package se.umu.cs.graphql;

import java.util.*;

public class IssueOrder {

    private OrderDirection direction;
    private IssueOrderField field;

    public IssueOrder() {
    }

    public IssueOrder(OrderDirection direction, IssueOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public IssueOrderField getField() {
        return field;
    }
    public void setField(IssueOrderField field) {
        this.field = field;
    }

}