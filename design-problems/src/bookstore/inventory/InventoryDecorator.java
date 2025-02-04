package bookstore.inventory;

public abstract class InventoryDecorator extends InventoryItem {
    protected InventoryItem decoratedItem;

    public InventoryDecorator(InventoryItem item) {
        super(item.itemName, item.quantity);
        this.decoratedItem = item;
    }

    public abstract void enhanceItem();
}