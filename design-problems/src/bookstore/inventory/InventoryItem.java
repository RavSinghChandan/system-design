package bookstore.inventory;

public class InventoryItem {
    String itemName;
    int quantity;

    public InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Quantity: " + quantity);
    }
}
