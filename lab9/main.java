import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int productId = -1;
    
    try {
      System.out.print("Enter the product ID: ");
      productId = Integer.parseInt(scanner.nextLine());
      
      String productName = getProductById(productId);
      
      System.out.println("Product Name: " + productName);
    } catch (NumberFormatException e) {
      System.out.println("Invalid product ID. Please enter a valid number.");
    } catch (ProductNotFoundException e) {
      System.out.println("Product not found in the database.");
    } catch (Exception e) {
      System.out.println("An error occurred while processing your request.");
    }
  }
  
  private static String getProductById(int productId) throws ProductNotFoundException {
    // code to fetch product from the database goes here
    if (productId == 1234) {
      return "Stickers by Yuckquee";
    } else {
      throw new ProductNotFoundException();
    }
  }
}

class ProductNotFoundException extends Exception {
  public ProductNotFoundException() {
    super("Product not found in the database.");
  }
}
