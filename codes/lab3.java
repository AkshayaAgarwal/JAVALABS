class Product {
    protected String name;
    protected int price;
  
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
  
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
  
    public void displayDetails(String store) {
        System.out.println("Store: " + store);
        displayDetails();
    }
}

class MobilePhone extends Product {
    private String brand;
  
    public MobilePhone(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }
  
    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }
  
    /*Override*/
    public void displayDetails(String store) {
        System.out.println("Accessories Store");
        super.displayDetails(store);
    }
}

class lab3 {
    public static void main(String[] args) {
        Product product = new Product("Laptop_Sticker", 299);
        product.displayDetails("Yuckquee");
        System.out.println();
      
        MobilePhone mobilePhone = new MobilePhone("iPhone_Skin", 249, "Apple");
        mobilePhone.displayDetails("Yuckquee");
    }
}