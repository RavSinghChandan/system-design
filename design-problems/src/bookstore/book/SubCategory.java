package bookstore.book;

// SubCategory.java
public class SubCategory extends Category {
    private String subName;

    public SubCategory(String name, String subName) {
        super(name);
        this.subName = subName;
    }

    public void displaySubCategory() {
        super.displayCategory();
        System.out.println("SubCategory: " + subName);
    }
}
