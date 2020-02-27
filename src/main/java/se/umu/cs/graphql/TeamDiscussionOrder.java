package se.umu.cs.graphql;

import java.util.*;

public class TeamDiscussionOrder {

    private OrderDirection direction;
    private TeamDiscussionOrderField field;

    public TeamDiscussionOrder() {
    }

    public TeamDiscussionOrder(OrderDirection direction, TeamDiscussionOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public TeamDiscussionOrderField getField() {
        return field;
    }
    public void setField(TeamDiscussionOrderField field) {
        this.field = field;
    }

}