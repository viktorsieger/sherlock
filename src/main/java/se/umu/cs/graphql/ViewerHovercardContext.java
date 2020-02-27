package se.umu.cs.graphql;

import java.util.*;

public class ViewerHovercardContext implements HovercardContext{

    private String message;
    private String octicon;
    private User viewer;

    public ViewerHovercardContext() {
    }

    public ViewerHovercardContext(String message, String octicon, User viewer) {
        this.message = message;
        this.octicon = octicon;
        this.viewer = viewer;
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

    public User getViewer() {
        return viewer;
    }
    public void setViewer(User viewer) {
        this.viewer = viewer;
    }

}