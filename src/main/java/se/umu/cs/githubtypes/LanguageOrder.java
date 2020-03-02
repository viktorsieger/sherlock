package se.umu.cs.githubtypes;

public class LanguageOrder {

    private OrderDirection direction;
    private LanguageOrderField field;

    public LanguageOrder() {
    }

    public LanguageOrder(OrderDirection direction, LanguageOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public LanguageOrderField getField() {
        return field;
    }
    public void setField(LanguageOrderField field) {
        this.field = field;
    }

}