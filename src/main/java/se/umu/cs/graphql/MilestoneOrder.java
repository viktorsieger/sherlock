package se.umu.cs.graphql;

import java.util.*;

public class MilestoneOrder {

    private OrderDirection direction;
    private MilestoneOrderField field;

    public MilestoneOrder() {
    }

    public MilestoneOrder(OrderDirection direction, MilestoneOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public MilestoneOrderField getField() {
        return field;
    }
    public void setField(MilestoneOrderField field) {
        this.field = field;
    }

}