import java.util.HashMap;

class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class Driver_q3 {

    public static double getAffordableProductsPercentage(Product[] products) {
        if (products == null || products.length == 0) {
            return 0.0;
        }

        HashMap<String, Integer> categoryCount = new HashMap<>();

        for (Product product : products) {
            String category = (product.getPrice() <= 50.0) ? "Affordable" : "Expensive";
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }

        int affordableCount = categoryCount.getOrDefault("Affordable", 0);
        int expensiveCount = categoryCount.getOrDefault("Expensive", 0);

        double totalProducts = affordableCount + expensiveCount;
        if (totalProducts == 0) {
            return 0.0;
        }

        return (affordableCount / totalProducts) * 100.0;
    }

    public static void main(String[] args) {
        Product[] shoppingCart1 = {
                new Product("Bread", 3.0),
                new Product("Bicycle", 170.0),
                new Product("Eggs", 4.0),
                new Product("Lego", 100.0),
        };

        Product[] shoppingCart2 = {};

        System.out.println("Percentage of Affordable Products in Cart 1: " + getAffordableProductsPercentage(shoppingCart1));
        System.out.println("Percentage of Affordable Products in Cart 2: " + getAffordableProductsPercentage(shoppingCart2));
    }
}