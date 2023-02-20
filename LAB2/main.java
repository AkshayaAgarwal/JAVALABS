public class main{

	public static void main(String[] args){

        admin ad = new admin();
        ad.setUserID(1);
        ad.setEmailID("akshaya@gmail.com");
        ad.setCategoryID(201);
        ad.setProducts("Accessories");
        ad.setDescription("I deal in mobile accessories");
        
        System.out.println("User ID: " + ad.getUserID());
        System.out.println("Email ID: " + ad.getEmailID());
        System.out.println("Category ID: " + ad.getCategoryID());
        System.out.println("Products: " + ad.getProducts());
        System.out.println("Description: " + ad.getDescription());
	
        Seller slr = new Seller();

        // Set values for data members
	    slr.setEmployeeID(12345);
	    slr.setEmpName("Akshaya");
	    slr.setAge(22);
	    slr.setEmail("yuckquee@example.com");
	    slr.setDepartmemt("Marketing");

	    // Get values of data members
	    System.out.println("Employee ID: " + slr.getEmployeeID());
	    System.out.println("Name: " + slr.getEmpName());
	    System.out.println("Age: " + slr.getAge());
	    System.out.println("Email: " + slr.getEmail());
	    System.out.println("Department: " + slr.getDeapartment());

    }	
}



class admin{

    public int UserID;
    public String EmailID;
    public int CategoryID;
    public String Products;
    public String Description;
    
    // Getters and setters for data members
    int getUserID() {
        return UserID;
    }

    void setUserID(int userID) {
        UserID = userID;
    }

    String getEmailID() {
        return EmailID;
    }

    void setEmailID(String emailID) {
        EmailID = emailID;
    }

    int getCategoryID() {
        return CategoryID;
    }

    void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    String getProducts() {
        return Products;
    }

    void setProducts(String Prod) {
        Products = Prod;
    }

    String getDescription() {
        return Description;
    }

    void setDescription(String description) {
        Description = description;
    }
}

class Seller{

	public int EmployeeID;
    public String Name;
    public int Age;
    public String Email;
    public String Department;
    

     // Getters and setters for data members
    
    int getEmployeeID() {
        return EmployeeID;
    }

    void setEmployeeID(int empID) { //employeeid
        EmployeeID = empID;
    }

    int getAge() {                 //employeeage
        return Age;
    }

    void setAge(int age) {
        Age = age;
    }

    String getEmpName() {           //name
        return Name;
    }

    void setEmpName(String name) {
        Name = name;
    }

     String getEmail() {       //department
        return Email;
    }

    void setEmail(String email) {
        Email = email;
   }

    String getDeapartment() {       //department
        return Department;
    }

    void setDepartmemt(String department) {
        Department = department;
   }
}

