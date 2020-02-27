package se.umu.cs.graphql;

import java.util.*;

public interface Subscribable {

    String getId();

    Boolean getViewerCanSubscribe();

    SubscriptionState getViewerSubscription();

}