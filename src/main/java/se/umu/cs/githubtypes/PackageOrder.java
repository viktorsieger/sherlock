package se.umu.cs.githubtypes;

public class PackageOrder {

    private OrderDirection direction;
    private PackageOrderField field;

    public PackageOrder() {
    }

    public PackageOrder(OrderDirection direction, PackageOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public PackageOrderField getField() {
        return field;
    }
    public void setField(PackageOrderField field) {
        this.field = field;
    }

}