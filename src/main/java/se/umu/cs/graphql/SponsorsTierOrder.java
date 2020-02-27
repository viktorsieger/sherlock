package se.umu.cs.graphql;

import java.util.*;

public class SponsorsTierOrder {

    private OrderDirection direction;
    private SponsorsTierOrderField field;

    public SponsorsTierOrder() {
    }

    public SponsorsTierOrder(OrderDirection direction, SponsorsTierOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public SponsorsTierOrderField getField() {
        return field;
    }
    public void setField(SponsorsTierOrderField field) {
        this.field = field;
    }

}