package se.umu.cs.old;

import java.util.Date;
import java.util.List;

public class Issue {

    private List<Label> labels;
    private User author;
    //private String bodyText;
    //private boolean closed;
    private Date closedAt;
    private Date createdAt;
    private String id;
    //private boolean locked;
    //private Milestone milestone;
    private IssueState state;
    private String title;
}
