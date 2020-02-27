package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountOrder {

    private OrderDirection direction;
    private EnterpriseServerUserAccountOrderField field;

    public EnterpriseServerUserAccountOrder() {
    }

    public EnterpriseServerUserAccountOrder(OrderDirection direction, EnterpriseServerUserAccountOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public EnterpriseServerUserAccountOrderField getField() {
        return field;
    }
    public void setField(EnterpriseServerUserAccountOrderField field) {
        this.field = field;
    }

}