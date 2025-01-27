package e.commerce.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private Map<String, InventoryItem> inventory = new HashMap<>();

    public void addItem(InventoryItem item) {
        inventory.put(item.getName(), item);
        System.out.println("Item added: " + item.getName());
    }

    public void updateQuantity(String itemName, int quantity) {
        InventoryItem item = inventory.get(itemName);
        if (item != null) {
            item.setQuantity(quantity);
            System.out.println("Updated quantity for " + itemName + ": " + quantity);
        } else {
            System.out.println("Item not found: " + itemName);
        }
    }
}
