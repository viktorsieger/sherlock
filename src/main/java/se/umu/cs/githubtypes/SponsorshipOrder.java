package se.umu.cs.githubtypes;

public class SponsorshipOrder {

    private OrderDirection direction;
    private SponsorshipOrderField field;

    public SponsorshipOrder() {
    }

    public SponsorshipOrder(OrderDirection direction, SponsorshipOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public SponsorshipOrderField getField() {
        return field;
    }
    public void setField(SponsorshipOrderField field) {
        this.field = field;
    }

}