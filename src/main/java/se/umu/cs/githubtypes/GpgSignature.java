package se.umu.cs.githubtypes;

public class GpgSignature implements GitSignature{

    private String email;
    private Boolean isValid;
    private String keyId;
    private String payload;
    private String signature;
    private User signer;
    private GitSignatureState state;
    private Boolean wasSignedByGitHub;

    public GpgSignature() {
    }

    public GpgSignature(String email, Boolean isValid, String keyId, String payload, String signature, User signer, GitSignatureState state, Boolean wasSignedByGitHub) {
        this.email = email;
        this.isValid = isValid;
        this.keyId = keyId;
        this.payload = payload;
        this.signature = signature;
        this.signer = signer;
        this.state = state;
        this.wasSignedByGitHub = wasSignedByGitHub;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getKeyId() {
        return keyId;
    }
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getPayload() {
        return payload;
    }
    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public User getSigner() {
        return signer;
    }
    public void setSigner(User signer) {
        this.signer = signer;
    }

    public GitSignatureState getState() {
        return state;
    }
    public void setState(GitSignatureState state) {
        this.state = state;
    }

    public Boolean getWasSignedByGitHub() {
        return wasSignedByGitHub;
    }
    public void setWasSignedByGitHub(Boolean wasSignedByGitHub) {
        this.wasSignedByGitHub = wasSignedByGitHub;
    }

}