package se.umu.cs.graphql;

import java.util.*;

public class CheckAnnotationPosition {

    private Integer column;
    private Integer line;

    public CheckAnnotationPosition() {
    }

    public CheckAnnotationPosition(Integer column, Integer line) {
        this.column = column;
        this.line = line;
    }

    public Integer getColumn() {
        return column;
    }
    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getLine() {
        return line;
    }
    public void setLine(Integer line) {
        this.line = line;
    }

}