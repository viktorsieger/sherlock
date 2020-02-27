package se.umu.cs.graphql;

import java.util.*;

public class OrganizationOrder {

    private OrderDirection direction;
    private OrganizationOrderField field;

    public OrganizationOrder() {
    }

    public OrganizationOrder(OrderDirection direction, OrganizationOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public OrganizationOrderField getField() {
        return field;
    }
    public void setField(OrganizationOrderField field) {
        this.field = field;
    }

}