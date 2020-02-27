package se.umu.cs.graphql;

import java.util.*;

public class ReviewStatusHovercardContext implements HovercardContext{

    private String message;
    private String octicon;

    public ReviewStatusHovercardContext() {
    }

    public ReviewStatusHovercardContext(String message, String octicon) {
        this.message = message;
        this.octicon = octicon;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getOcticon() {
        return octicon;
    }
    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

}