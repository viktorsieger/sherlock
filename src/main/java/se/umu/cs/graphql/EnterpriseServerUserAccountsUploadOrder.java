package se.umu.cs.graphql;

import java.util.*;

public class EnterpriseServerUserAccountsUploadOrder {

    private OrderDirection direction;
    private EnterpriseServerUserAccountsUploadOrderField field;

    public EnterpriseServerUserAccountsUploadOrder() {
    }

    public EnterpriseServerUserAccountsUploadOrder(OrderDirection direction, EnterpriseServerUserAccountsUploadOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public EnterpriseServerUserAccountsUploadOrderField getField() {
        return field;
    }
    public void setField(EnterpriseServerUserAccountsUploadOrderField field) {
        this.field = field;
    }

}