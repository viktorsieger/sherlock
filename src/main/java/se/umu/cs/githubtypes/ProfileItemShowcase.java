package se.umu.cs.githubtypes;

public class ProfileItemShowcase {

    private Boolean hasPinnedItems;
    private PinnableItemConnection items;

    public ProfileItemShowcase() {
    }

    public ProfileItemShowcase(Boolean hasPinnedItems, PinnableItemConnection items) {
        this.hasPinnedItems = hasPinnedItems;
        this.items = items;
    }

    public Boolean getHasPinnedItems() {
        return hasPinnedItems;
    }
    public void setHasPinnedItems(Boolean hasPinnedItems) {
        this.hasPinnedItems = hasPinnedItems;
    }

    public PinnableItemConnection getItems() {
        return items;
    }
    public void setItems(PinnableItemConnection items) {
        this.items = items;
    }

}