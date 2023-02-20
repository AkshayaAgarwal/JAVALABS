public class lab4 {
    public static void main(String[] args) {

        product p1 = new product("Cup", 10);
        product p2 = new product("Glass", 20);

        product p3 = new product("Bottle", 100);
        product p4 = new product("Pepsi", 150);

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
    String name;
    int quantity;
    static String company = "Wallmart";
    static int count = 0;
    static String message = "This message is from nested class";

    product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

    }

    public static class test {
        public void display() {
            System.out.println(message);
        }

    }

    static void change() {
        System.out.println("The Company has changed. Static Function is called.");
        System.out.println("\n");
        company = "Amazon";
    }

    static {
        System.out.println("Hi! Welcome to Lab 4 Java Program. This message is from static block.");
        System.out.println("\n");
    }

    void display() {
        count = count + 1;
        System.out.println("Product " + count);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Company: " + company);
        System.out.println("\n");
    }
}