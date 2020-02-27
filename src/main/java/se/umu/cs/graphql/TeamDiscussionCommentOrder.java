package se.umu.cs.graphql;

import java.util.*;

public class TeamDiscussionCommentOrder {

    private OrderDirection direction;
    private TeamDiscussionCommentOrderField field;

    public TeamDiscussionCommentOrder() {
    }

    public TeamDiscussionCommentOrder(OrderDirection direction, TeamDiscussionCommentOrderField field) {
        this.direction = direction;
        this.field = field;
    }

    public OrderDirection getDirection() {
        return direction;
    }
    public void setDirection(OrderDirection direction) {
        this.direction = direction;
    }

    public TeamDiscussionCommentOrderField getField() {
        return field;
    }
    public void setField(TeamDiscussionCommentOrderField field) {
        this.field = field;
    }

}