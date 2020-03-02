package se.umu.cs.githubtypes;

public class SavedReplyOrder {

    private OrderDirection direction;
    private SavedReplyOrderField field;

    public SavedReplyOrder() {
    }

    public SavedReplyOrder(OrderDirection direction, SavedReplyOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public SavedReplyOrderField getField() {
        return field;
    }
    public void setField(SavedReplyOrderField field) {
        this.field = field;
    }

}