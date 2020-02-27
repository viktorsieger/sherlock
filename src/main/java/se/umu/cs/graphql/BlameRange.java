package se.umu.cs.graphql;

import java.util.*;

public class BlameRange {

    private Integer age;
    private Commit commit;
    private Integer endingLine;
    private Integer startingLine;

    public BlameRange() {
    }

    public BlameRange(Integer age, Commit commit, Integer endingLine, Integer startingLine) {
        this.age = age;
        this.commit = commit;
        this.endingLine = endingLine;
        this.startingLine = startingLine;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Commit getCommit() {
        return commit;
    }
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Integer getEndingLine() {
        return endingLine;
    }
    public void setEndingLine(Integer endingLine) {
        this.endingLine = endingLine;
    }

    public Integer getStartingLine() {
        return startingLine;
    }
    public void setStartingLine(Integer startingLine) {
        this.startingLine = startingLine;
    }

}