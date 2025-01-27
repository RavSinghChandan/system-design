package e.commerce.inventory;

public abstract class InventoryPrototype {

    private InventoryItem item;

    public InventoryPrototype(InventoryItem item) {
        this.item = item;
    }

    public InventoryItem cloneItem() {
        return new InventoryItem(item.getName(), item.getQuantity());
    }
}
