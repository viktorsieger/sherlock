package se.umu.cs.graphql;

import java.util.*;

public class CheckAnnotationSpan {

    private CheckAnnotationPosition end;
    private CheckAnnotationPosition start;

    public CheckAnnotationSpan() {
    }

    public CheckAnnotationSpan(CheckAnnotationPosition end, CheckAnnotationPosition start) {
        this.end = end;
        this.start = start;
    }

    public CheckAnnotationPosition getEnd() {
        return end;
    }
    public void setEnd(CheckAnnotationPosition end) {
        this.end = end;
    }

    public CheckAnnotationPosition getStart() {
        return start;
    }
    public void setStart(CheckAnnotationPosition start) {
        this.start = start;
    }

}