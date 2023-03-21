import java.util.ArrayList;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        for (int i = 0; i < args.length; i += 2) {
            String name = args[i];
            double price = Double.parseDouble(args[i+1]);
            Product product = new Product(name, price);
            products.add(product);
        }

        for (Product product : products) {
            System.out.println("Product name: " + product.getName());
            System.out.println("Product price: " + product.getPrice());
            System.out.println();
        }
    }
}
