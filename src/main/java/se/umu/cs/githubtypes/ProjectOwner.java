package se.umu.cs.githubtypes;

public interface ProjectOwner {

    String getId();

    Project getProject();

    ProjectConnection getProjects();

    String getProjectsResourcePath();

    String getProjectsUrl();

    Boolean getViewerCanCreateProjects();

}