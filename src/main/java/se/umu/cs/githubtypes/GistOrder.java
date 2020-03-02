package se.umu.cs.githubtypes;

public class GistOrder {

    private OrderDirection direction;
    private GistOrderField field;

    public GistOrder() {
    }

    public GistOrder(OrderDirection direction, GistOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public GistOrderField getField() {
        return field;
    }
    public void setField(GistOrderField field) {
        this.field = field;
    }

}