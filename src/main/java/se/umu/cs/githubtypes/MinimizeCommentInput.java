package se.umu.cs.githubtypes;

public class MinimizeCommentInput {

    private ReportedContentClassifiers classifier;
    private String clientMutationId;
    private String subjectId;

    public MinimizeCommentInput() {
    }

    public MinimizeCommentInput(ReportedContentClassifiers classifier, String clientMutationId, String subjectId) {
        this.classifier = classifier;
        this.clientMutationId = clientMutationId;
        this.subjectId = subjectId;
    }

    public ReportedContentClassifiers getClassifier() {
        return classifier;
    }
    public void setClassifier(ReportedContentClassifiers classifier) {
        this.classifier = classifier;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public String getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}