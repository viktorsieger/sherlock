package se.umu.cs.graphql;

import java.util.*;

public interface ProjectOwner {

    String getId();

    Project getProject();

    ProjectConnection getProjects();

    String getProjectsResourcePath();

    String getProjectsUrl();

    Boolean getViewerCanCreateProjects();

}