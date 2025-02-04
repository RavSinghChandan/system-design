package bookstore.inventory;

// InventoryPrototype.java
public class InventoryPrototype implements Cloneable {
    private String itemName;
    private int quantity;

    public InventoryPrototype(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
