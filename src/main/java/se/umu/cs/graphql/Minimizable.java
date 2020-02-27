package se.umu.cs.graphql;

import java.util.*;

public interface Minimizable {

    Boolean getIsMinimized();

    String getMinimizedReason();

    Boolean getViewerCanMinimize();

}