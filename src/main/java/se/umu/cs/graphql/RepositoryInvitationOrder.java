package se.umu.cs.graphql;

import java.util.*;

public class RepositoryInvitationOrder {

    private OrderDirection direction;
    private RepositoryInvitationOrderField field;

    public RepositoryInvitationOrder() {
    }

    public RepositoryInvitationOrder(OrderDirection direction, RepositoryInvitationOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public RepositoryInvitationOrderField getField() {
        return field;
    }
    public void setField(RepositoryInvitationOrderField field) {
        this.field = field;
    }

}