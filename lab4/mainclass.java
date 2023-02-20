
public class mainclass {
    public static void main(String[] args) {

        product p1 = new product("Laptop sleeves", 99);
        product p2 = new product("Glass Covers", 11);

        product p3 = new product("Mobile stickers", 10);
        product p4 = new product("Laptop stickers", 15);

        p1.display();
        p2.display();
        product.change();
        p3.display();
        p4.display();

        product.test mess = new product.test();

        mess.display();

    }
}

class product {
    String category;
    int quantity;
    static String company = "Stickersbaba";
    static int count = 0;
    static String message = "This message is from nested class";

    product(String category, int quantity) {
        this.category = category;
        this.quantity = quantity;

    }

    public static class test {
        public void display() {
            System.out.println(message);
        }

    }

    static void change() {
        System.out.println("Static Function is called. The company name  has been changed");
        System.out.println("\n");
        company = "Yuckquee";
    }

    static {
        System.out.println("Lab 4. static block.");
        System.out.println("\n");
    }

    void display() {
        count = count + 1;
        System.out.println("Product " + count);
        System.out.println("Category: " + category);
        System.out.println("Quantity: " + quantity);
        System.out.println("Brand: " + company);
        System.out.println("\n");
    }
}