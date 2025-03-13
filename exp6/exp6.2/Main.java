import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Electronics", 1000.00));
        products.add(new Product("Phone", "Electronics", 700.00));
        products.add(new Product("Shirt", "Clothing", 30.00));
        products.add(new Product("Jeans", "Clothing", 50.00));
        products.add(new Product("Washing Machine", "Home Appliances", 400.00));
        products.add(new Product("Microwave", "Home Appliances", 120.00));
        products.add(new Product("Headphones", "Electronics", 150.00));
        products.add(new Product("Jacket", "Clothing", 80.00));

        // Grouping products by category
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        // Display products grouped by category
        System.out.println("Products grouped by category:");
        groupedByCategory.forEach((category, productList) -> {
            System.out.println(category + ": " + productList);
        });

        // Finding the most expensive product in each category
        System.out.println("\nMost expensive product in each category:");
        Map<String, Optional<Product>> mostExpensiveProductInCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
                ));

        mostExpensiveProductInCategory.forEach((category, product) -> {
            System.out.println(category + ": " + product.map(Product::getName).orElse("No product"));
        });

        // Calculating the average price of all products
        double averagePrice = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);

        System.out.println("\nAverage price of all products: $" + averagePrice);
    }
}
