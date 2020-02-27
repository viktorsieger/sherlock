package se.umu.cs.graphql;

import java.util.*;

public class PackageFileOrder {

    private OrderDirection direction;
    private PackageFileOrderField field;

    public PackageFileOrder() {
    }

    public PackageFileOrder(OrderDirection direction, PackageFileOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public PackageFileOrderField getField() {
        return field;
    }
    public void setField(PackageFileOrderField field) {
        this.field = field;
    }

}