package se.umu.cs.graphql;

import java.util.*;

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