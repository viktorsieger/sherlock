package se.umu.cs.githubtypes;

public class EnterpriseMemberOrder {

    private OrderDirection direction;
    private EnterpriseMemberOrderField field;

    public EnterpriseMemberOrder() {
    }

    public EnterpriseMemberOrder(OrderDirection direction, EnterpriseMemberOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public EnterpriseMemberOrderField getField() {
        return field;
    }
    public void setField(EnterpriseMemberOrderField field) {
        this.field = field;
    }

}