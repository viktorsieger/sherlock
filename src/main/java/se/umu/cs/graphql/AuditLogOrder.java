package se.umu.cs.graphql;

import java.util.*;

public class AuditLogOrder {

    private OrderDirection direction;
    private AuditLogOrderField field;

    public AuditLogOrder() {
    }

    public AuditLogOrder(OrderDirection direction, AuditLogOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public AuditLogOrderField getField() {
        return field;
    }
    public void setField(AuditLogOrderField field) {
        this.field = field;
    }

}