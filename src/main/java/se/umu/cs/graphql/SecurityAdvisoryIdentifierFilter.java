package se.umu.cs.graphql;

import java.util.*;

public class SecurityAdvisoryIdentifierFilter {

    private SecurityAdvisoryIdentifierType type;
    private String value;

    public SecurityAdvisoryIdentifierFilter() {
    }

    public SecurityAdvisoryIdentifierFilter(SecurityAdvisoryIdentifierType type, String value) {
        this.type = type;
        this.value = value;
    }

    public SecurityAdvisoryIdentifierType getType() {
        return type;
    }
    public void setType(SecurityAdvisoryIdentifierType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}