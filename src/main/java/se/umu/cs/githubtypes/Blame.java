package se.umu.cs.githubtypes;

import java.util.Collection;

public class Blame {

    private Collection<BlameRange> ranges;

    public Blame() {
    }

    public Blame(Collection<BlameRange> ranges) {
        this.ranges = ranges;
    }

    public Collection<BlameRange> getRanges() {
        return ranges;
    }
    public void setRanges(Collection<BlameRange> ranges) {
        this.ranges = ranges;
    }

}