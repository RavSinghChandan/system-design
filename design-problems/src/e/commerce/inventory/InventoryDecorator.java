package e.commerce.inventory;

public  abstract class InventoryDecorator {

    protected InventoryService inventoryService;

    public InventoryDecorator(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public abstract void addItem(InventoryItem item);
}
