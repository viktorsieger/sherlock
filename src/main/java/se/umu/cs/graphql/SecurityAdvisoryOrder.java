package se.umu.cs.graphql;

import java.util.*;

public class SecurityAdvisoryOrder {

    private OrderDirection direction;
    private SecurityAdvisoryOrderField field;

    public SecurityAdvisoryOrder() {
    }

    public SecurityAdvisoryOrder(OrderDirection direction, SecurityAdvisoryOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public SecurityAdvisoryOrderField getField() {
        return field;
    }
    public void setField(SecurityAdvisoryOrderField field) {
        this.field = field;
    }

}