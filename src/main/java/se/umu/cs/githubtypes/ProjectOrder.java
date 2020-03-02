package se.umu.cs.githubtypes;

public class ProjectOrder {

    private OrderDirection direction;
    private ProjectOrderField field;

    public ProjectOrder() {
    }

    public ProjectOrder(OrderDirection direction, ProjectOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public ProjectOrderField getField() {
        return field;
    }
    public void setField(ProjectOrderField field) {
        this.field = field;
    }

}