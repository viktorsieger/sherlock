package se.umu.cs.old;

import java.util.Date;
import java.util.List;

public class PullRequest {

    private List<Commit> commits;
    private List<Label> labels;
    //private String bodyText;
    private boolean closed;
    private Date closedAt;
    private Date createdAt;
    private String id;
    //private boolean isDraft;
    private boolean locked;
    private PullRequestState state;
    //private String title;
}
