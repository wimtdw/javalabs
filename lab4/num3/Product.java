package lab4.num3;

public class Product {
    private String productId;
    private String name;
    private double price;
    private Category category;

    public Product(String productId, String name, double price, Category category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public String getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: $" + price + ", Category: " + category;
    }
}

