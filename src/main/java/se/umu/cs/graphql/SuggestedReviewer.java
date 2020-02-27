package se.umu.cs.graphql;

import java.util.*;

public class SuggestedReviewer {

    private Boolean isAuthor;
    private Boolean isCommenter;
    private User reviewer;

    public SuggestedReviewer() {
    }

    public SuggestedReviewer(Boolean isAuthor, Boolean isCommenter, User reviewer) {
        this.isAuthor = isAuthor;
        this.isCommenter = isCommenter;
        this.reviewer = reviewer;
    }

    public Boolean getIsAuthor() {
        return isAuthor;
    }
    public void setIsAuthor(Boolean isAuthor) {
        this.isAuthor = isAuthor;
    }

    public Boolean getIsCommenter() {
        return isCommenter;
    }
    public void setIsCommenter(Boolean isCommenter) {
        this.isCommenter = isCommenter;
    }

    public User getReviewer() {
        return reviewer;
    }
    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

}