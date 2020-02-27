package se.umu.cs.graphql;

import java.util.*;

public class PackageVersionOrder {

    private OrderDirection direction;
    private PackageVersionOrderField field;

    public PackageVersionOrder() {
    }

    public PackageVersionOrder(OrderDirection direction, PackageVersionOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public PackageVersionOrderField getField() {
        return field;
    }
    public void setField(PackageVersionOrderField field) {
        this.field = field;
    }

}