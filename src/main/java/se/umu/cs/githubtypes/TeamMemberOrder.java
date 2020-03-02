package se.umu.cs.githubtypes;

public class TeamMemberOrder {

    private OrderDirection direction;
    private TeamMemberOrderField field;

    public TeamMemberOrder() {
    }

    public TeamMemberOrder(OrderDirection direction, TeamMemberOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public TeamMemberOrderField getField() {
        return field;
    }
    public void setField(TeamMemberOrderField field) {
        this.field = field;
    }

}