package se.umu.cs.githubtypes;

public class CheckAnnotationRange {

    private Integer endColumn;
    private Integer endLine;
    private Integer startColumn;
    private Integer startLine;

    public CheckAnnotationRange() {
    }

    public CheckAnnotationRange(Integer endColumn, Integer endLine, Integer startColumn, Integer startLine) {
        this.endColumn = endColumn;
        this.endLine = endLine;
        this.startColumn = startColumn;
        this.startLine = startLine;
    }

    public Integer getEndColumn() {
        return endColumn;
    }
    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    public Integer getEndLine() {
        return endLine;
    }
    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    public Integer getStartColumn() {
        return startColumn;
    }
    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    public Integer getStartLine() {
        return startLine;
    }
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

}