package se.umu.cs.githubtypes;

import java.util.Collection;

public class CommitAuthor {

    private Collection<String> emails;
    private String id;

    public CommitAuthor() {
    }

    public CommitAuthor(Collection<String> emails, String id) {
        this.emails = emails;
        this.id = id;
    }

    public Collection<String> getEmails() {
        return emails;
    }
    public void setEmails(Collection<String> emails) {
        this.emails = emails;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}