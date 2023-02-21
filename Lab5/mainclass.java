package Lab5;
//import java.util.Scanner;

public class mainclass {
   
    
    
    public static void main(String[] args) {
      //  Scanner scan = new Scanner(System.in);
        // String Methods
        
        System.out.println("\nString Methoods are: \n");
//1. UPPER CASE
        String product = "t-shirt";
        String productInAllCaps = product.toUpperCase();
        System.out.println(productInAllCaps); // Output: T-SHIRT
//2 CONCATING STRING. 
        String productName = "T-Shirt";
        String productColor = "Blue Colour";
        String productDescription = productName.concat(" in ").concat(productColor);
        System.out.println(productDescription); // Output: T-Shirt in Blue
//3. LENGTH OF THE STRING
        String password = "Password@123";
        if (password.length() >= 8) {
            System.out.println("Password meets length requirements");
        } else {
            System.out.println("Password does not meet length requirements");
        }
//4. INDEXING AND OUTPUT AS PER INDEX
        String fullName = "Yuckquee";
        String firstName = fullName.substring(0, 4);
        System.out.println(firstName); // Output: Yuck
//5. REPLACING THE STRING
        String userInput = "This is a **** good product!";
        String sanitizedInput = userInput.replace("****", "damn");
        System.out.println(sanitizedInput); 


       // StringBuffer Methods
//1. APPENDING THE STRING
       StringBuffer address = new StringBuffer();
       System.out.println("\nString Buffer Methoods are: \n");
       System.out.println("\nSeller Address \n");
       address.append("Ganesh ganj\n");
       address.append("latosh road\n");
       address.append("Lucknow, UP");
       System.out.println(address.toString());

//2. ADDITION OF SOMETHING IN BETWEEN OF A STRING AS PER INDEX 
       StringBuffer Description = new StringBuffer("This is a product description.");
       Description.insert(14, "\n");
       System.out.println(Description.toString()); // Output: here i am breaking but it can insert something in the string
//3.REVERSING THE STRING
       StringBuffer productSKU = new StringBuffer("ABC123");
        productSKU.reverse();
        System.out.println(productSKU.toString());
//4. DELETING THE STRING 
        StringBuffer ab=new StringBuffer("Hello");  
        ab.delete(1,3);  
        System.out.println(ab);//prints Hlo  
//5. 
        StringBuffer sb =new StringBuffer();  
        System.out.println(sb.capacity());//default 16  
        sb.append("Domain");  
        System.out.println(sb.capacity());//now 16  
        sb.append("E:Commerce brand");  
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		}
    }


    

