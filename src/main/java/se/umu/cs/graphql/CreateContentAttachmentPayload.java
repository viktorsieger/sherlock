package se.umu.cs.graphql;

import java.util.*;

public class CreateContentAttachmentPayload {

    private String clientMutationId;
    private ContentAttachment contentAttachment;

    public CreateContentAttachmentPayload() {
    }

    public CreateContentAttachmentPayload(String clientMutationId, ContentAttachment contentAttachment) {
        this.clientMutationId = clientMutationId;
        this.contentAttachment = contentAttachment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }
    public void setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
    }

    public ContentAttachment getContentAttachment() {
        return contentAttachment;
    }
    public void setContentAttachment(ContentAttachment contentAttachment) {
        this.contentAttachment = contentAttachment;
    }

}