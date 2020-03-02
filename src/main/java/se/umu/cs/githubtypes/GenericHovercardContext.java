package se.umu.cs.githubtypes;

public class GenericHovercardContext implements HovercardContext{

    private String message;
    private String octicon;

    public GenericHovercardContext() {
    }

    public GenericHovercardContext(String message, String octicon) {
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