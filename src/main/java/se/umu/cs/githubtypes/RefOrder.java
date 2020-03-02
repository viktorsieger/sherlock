package se.umu.cs.githubtypes;

public class RefOrder {

    private OrderDirection direction;
    private RefOrderField field;

    public RefOrder() {
    }

    public RefOrder(OrderDirection direction, RefOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public RefOrderField getField() {
        return field;
    }
    public void setField(RefOrderField field) {
        this.field = field;
    }

}