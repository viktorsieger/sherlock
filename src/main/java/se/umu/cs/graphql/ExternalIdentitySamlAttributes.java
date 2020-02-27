package se.umu.cs.graphql;

import java.util.*;

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