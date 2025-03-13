public class Product {
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // toString method to display product details
    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + "', price=" + price + '}';
    }
}
