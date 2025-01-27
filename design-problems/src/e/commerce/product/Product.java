package e.commerce.product;

public class Product {

    private String name;
    private String category;
    private double price;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public static class ProductBuilder {
        private String name;
        private String category;
        private double price;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
