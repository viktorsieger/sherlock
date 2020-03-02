package se.umu.cs.githubtypes;

public class ExternalIdentitySamlAttributes {

    private String nameId;

    public ExternalIdentitySamlAttributes() {
    }

    public ExternalIdentitySamlAttributes(String nameId) {
        this.nameId = nameId;
    }

    public String getNameId() {
        return nameId;
    }
    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

}