package se.umu.cs.githubtypes;

public interface Subscribable {

    String getId();

    Boolean getViewerCanSubscribe();

    SubscriptionState getViewerSubscription();

}