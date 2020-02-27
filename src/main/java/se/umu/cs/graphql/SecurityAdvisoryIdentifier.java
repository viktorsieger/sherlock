package se.umu.cs.graphql;

import java.util.*;

public class SecurityAdvisoryIdentifier {

    private String type;
    private String value;

    public SecurityAdvisoryIdentifier() {
    }

    public SecurityAdvisoryIdentifier(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}