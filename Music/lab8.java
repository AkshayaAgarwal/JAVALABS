package Music;
import java.util.ArrayList;

// Product interface
interface Product {
   public String getName();
   public double getPrice();
}

// Song class that implements Product interface
class Song implements Product {
   private String name;
   private String artist;
   private double price;

   public Song(String name, String artist, double price) {
      this.name = name;
      this.artist = artist;
      this.price = price;
   }

   // Implement Product interface methods
   @Override
   public String getName() {
      return name;
   }

   @Override
   public double getPrice() {
      return price;
   }

   // Getters and setters for Song properties
   public String getArtist() {
      return artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}

// Cart interface
interface Cart {
   public void addItem(Product item);
   public void removeItem(Product item);
   public double getTotal();
}

// BasicCart class that implements Cart interface
class BasicCart implements Cart {
   private ArrayList<Product> items;

   public BasicCart() {
      items = new ArrayList<>();
   }

   // Implement Cart interface methods
   @Override
   public void addItem(Product item) {
      items.add(item);
   }

   @Override
   public void removeItem(Product item) {
      items.remove(item);
   }

   @Override
   public double getTotal() {
      double total = 0;
      for (Product item : items) {
         total += item.getPrice();
      }
      return total;
   }

   // Getters and setters for BasicCart properties
   public ArrayList<Product> getItems() {
      return items;
   }

   public void setItems(ArrayList<Product> items) {
      this.items = items;
   }
}

// Main class
public class lab8 {
   public static void main(String[] args) {
      Product item1 = new Song("Honey Singh 3.0", "Honey singh", 48.00);
      Product item2 = new Song("Players", "Badshah", 35.00);
      
      BasicCart cart = new BasicCart();
      cart.addItem(item1);
      cart.addItem(item2);
      System.out.println("Total price of both : $" + cart.getTotal());
      
      cart.removeItem(item1);
      System.out.println("Price of second disk: $" + cart.getTotal());
   }
}
