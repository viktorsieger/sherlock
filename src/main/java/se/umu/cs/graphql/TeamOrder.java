package se.umu.cs.graphql;

import java.util.*;

public class TeamOrder {

    private OrderDirection direction;
    private TeamOrderField field;

    public TeamOrder() {
    }

    public TeamOrder(OrderDirection direction, TeamOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public TeamOrderField getField() {
        return field;
    }
    public void setField(TeamOrderField field) {
        this.field = field;
    }

}