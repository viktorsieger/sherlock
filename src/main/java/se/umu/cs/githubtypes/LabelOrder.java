package se.umu.cs.githubtypes;

public class LabelOrder {

    private OrderDirection direction;
    private LabelOrderField field;

    public LabelOrder() {
    }

    public LabelOrder(OrderDirection direction, LabelOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public LabelOrderField getField() {
        return field;
    }
    public void setField(LabelOrderField field) {
        this.field = field;
    }

}