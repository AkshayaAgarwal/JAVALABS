import java.util.Scanner;

// Abstract class that represents a generic ecommerce platform
abstract class EcommercePlatform {
    private String brand;
    private String name;
    private boolean isLoggedIn;

    public EcommercePlatform(String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.isLoggedIn = false;
    }

    // Abstract method to show products
    public abstract void showProducts();

    public String getName(){
        return name;
    }

    public boolean isLoggedIn(){
        return isLoggedIn;
    }

    public void login() {
        this.isLoggedIn = true;
        System.out.println("Logged in to " + this.brand + " " + this.name);
    }

    public void logout() {
        this.isLoggedIn = false;
        System.out.println("Logged out from " + this.brand + " " + this.name);
    }
}

// Final class that extends the EcommercePlatform class and represents a specific ecommerce platform
final class Amazon extends EcommercePlatform {
    public Amazon(String name) {
        super("Yuckquee", name);
    }

    // Overrides the showProducts() method of the EcommercePlatform class
    public void showProducts() {
        System.out.println("Showing products on Yuckquee " + getName());
    }
}

// Final class that extends the EcommercePlatform class and represents a specific ecommerce platform
final class eBay extends EcommercePlatform {
    public eBay(String name) {
        super("StickersBABA", name);
    }

    // Overrides the showProducts() method of the EcommercePlatform class
    public void showProducts() {
        System.out.println("Showing products on StickersBABA " + getName());
    }
}

public class Java_Lab_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ecommerce platform type (Yuckquee or StickersBABA):");
        String platformType = scanner.nextLine();
        System.out.println("Enter platform name:");
        String name = scanner.nextLine();

        EcommercePlatform platform = null;
        if (platformType.equalsIgnoreCase("Yuckquee")) {
            platform = new Amazon(name);
        } else if (platformType.equalsIgnoreCase("StickersBABA")) {
            platform = new eBay(name);
        } else {
            System.out.println("Invalid ecommerce platform type.");
            return;
        }

        while(true){
            System.out.println("(1) Login\n(2) Show Products\n(3) Logout\nEnter : ");
            int ch;
            ch = scanner.nextInt();
            switch(ch){
                case 1: platform.login();
                    break;
                case 2:
                    if(!platform.isLoggedIn())
                        System.out.println("Log in to the platform first");
                    else
                        platform.showProducts();
                    break;
                case 3:
                    if(!platform.isLoggedIn())
                        System.out.println("You are already logged out");
                    else
                        platform.logout();
                    break;
            }
        }
    }
}
