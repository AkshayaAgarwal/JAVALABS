import java.util.*;

class Person{
    private String name,address;
    private byte age;

    public Person(String name, byte age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.address = person.address;
    }


    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter age : ");
        age = sc.nextByte();
        System.out.print("Enter address : ");
        address = sc.next();
    }

    void show(){
        System.out.println("Name : " + name);
        System.out.println("Age : "+age);
        System.out.println("Address "+ address);
    }
}

class Employee extends Person{
    private int EmployeeID;
    private String companyName, Department, Designation;

    public Employee(String name, byte age, String address, int EmployeeID, String companyName, String Department, String Designation) {
        super(name, age, address);
        this.EmployeeID = EmployeeID;
        this.companyName = companyName;
        this.Department = Department;
        this.Designation = Designation;
    }

    public Employee(Employee emp) {
        super(emp);
        this.EmployeeID = emp.EmployeeID;
        this.companyName = emp.companyName;
        this.Department = emp.Department;
        this.Designation = emp.Designation;
    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        super.read();
        System.out.print("Enter Employee ID: ");
        EmployeeID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Department: ");
        Department = sc.nextLine();
        System.out.print("Enter Designation: ");
        Designation = sc.nextLine();
    }

    public void display() {
        super.show();
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Company Name: " + companyName);
        System.out.println("Department: " + Department);
        System.out.println("Designation: " + Designation);
    }
}

class EmployeeSalary extends Employee{
    private int Basic,DA,HRA,PF,IT;
    public EmployeeSalary(String name, byte age, String address, int EmployeeID, String companyName, String Department, String Designation, int Basic, int DA, int HRA, int PF, int IT){
        super(name,age,address,EmployeeID,companyName,Department,Designation);
        this.Basic= Basic;
        this.DA = DA;
        this.HRA = HRA;
        this.PF = PF;
        this.IT = IT;
    }

    public EmployeeSalary(EmployeeSalary sal){
        super(sal);
        this.Basic= sal.Basic;
        this.DA = sal.DA;
        this.HRA = sal.HRA;
        this.PF = sal.PF;
        this.IT = sal.IT;
    }

    public void read(){
        super.read();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic salary : ");
        Basic = sc.nextInt();
        System.out.print("Enter DA salary : ");
        DA = sc.nextInt();
        System.out.print("Enter HRA salary : ");
        HRA = sc.nextInt();
        System.out.print("Enter PF salary : ");
        PF = sc.nextInt();
        System.out.print("Enter IT salary : ");
        IT = sc.nextInt();
    }

    public void Net_salary(){
        int gross,net;
        gross = Basic+DA+HRA;
        net = gross - PF - IT;
        System.out.println("Gross salary : " + gross);
        System.out.println("Net salary : " + net);
    }
}

public class pLab {
    public static void main(String args[]){
        EmployeeSalary ob1 = new EmployeeSalary(null, (byte)0,null,0,null,null,null,0,0,0,0,0);
        System.out.println("\n\n-------- Running parameterized constructor --------");
        ob1.read();
        System.out.println("\n-------- Parameterized constructor results --------");
        ob1.Net_salary();
        System.out.println("-------------------------------------------");

        EmployeeSalary ob2 = new EmployeeSalary(ob1);
        System.out.println("\n\n-------- Copy constructor results --------");
        ob2.Net_salary();
    }
}
