package se.umu.cs.graphql;

import java.util.*;

public class UserStatusOrder {

    private OrderDirection direction;
    private UserStatusOrderField field;

    public UserStatusOrder() {
    }

    public UserStatusOrder(OrderDirection direction, UserStatusOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public UserStatusOrderField getField() {
        return field;
    }
    public void setField(UserStatusOrderField field) {
        this.field = field;
    }

}