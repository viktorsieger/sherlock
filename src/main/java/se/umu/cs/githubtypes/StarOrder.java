package se.umu.cs.githubtypes;

public class StarOrder {

    private OrderDirection direction;
    private StarOrderField field;

    public StarOrder() {
    }

    public StarOrder(OrderDirection direction, StarOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public StarOrderField getField() {
        return field;
    }
    public void setField(StarOrderField field) {
        this.field = field;
    }

}