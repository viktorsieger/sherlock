package se.umu.cs.graphql;

import java.util.*;

public class ReleaseOrder {

    private OrderDirection direction;
    private ReleaseOrderField field;

    public ReleaseOrder() {
    }

    public ReleaseOrder(OrderDirection direction, ReleaseOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public ReleaseOrderField getField() {
        return field;
    }
    public void setField(ReleaseOrderField field) {
        this.field = field;
    }

}