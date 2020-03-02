package se.umu.cs.githubtypes;

public class AddReactionPayload {

    private String clientMutationId;
    private Reaction reaction;
    private Reactable subject;

    public AddReactionPayload() {
    }

    public AddReactionPayload(String clientMutationId, Reaction reaction, Reactable subject) {
        this.clientMutationId = clientMutationId;
        this.reaction = reaction;
        this.subject = subject;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public Reaction getReaction() {
        return reaction;
    }
    public void setReaction(Reaction reaction) {
        this.reaction = reaction;
    }

    public Reactable getSubject() {
        return subject;
    }
    public void setSubject(Reactable subject) {
        this.subject = subject;
    }

}