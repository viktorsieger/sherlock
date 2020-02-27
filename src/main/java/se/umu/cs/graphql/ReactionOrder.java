package se.umu.cs.graphql;

import java.util.*;

public class ReactionOrder {

    private OrderDirection direction;
    private ReactionOrderField field;

    public ReactionOrder() {
    }

    public ReactionOrder(OrderDirection direction, ReactionOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public ReactionOrderField getField() {
        return field;
    }
    public void setField(ReactionOrderField field) {
        this.field = field;
    }

}