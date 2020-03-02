package se.umu.cs.githubtypes;

public class TeamRepositoryOrder {

    private OrderDirection direction;
    private TeamRepositoryOrderField field;

    public TeamRepositoryOrder() {
    }

    public TeamRepositoryOrder(OrderDirection direction, TeamRepositoryOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public TeamRepositoryOrderField getField() {
        return field;
    }
    public void setField(TeamRepositoryOrderField field) {
        this.field = field;
    }

}