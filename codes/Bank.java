abstract class Bank {
    abstract int getRateofInterest();
}
class SBI extends Bank{
int getRateofInterest(){return 7;}
}
class ICICI extends Bank{
    int getRateofInterest(){return 8;}
}
class BOB extends Bank{
    int getRateofInterest(){return 10;}
}
class AbstractBank{
    public static void main (String args[]){
        Bank a = new SBI();
        Bank b = new ICICI();
        Bank c = new BOB();

int sbi_in=a.getRateofInterest();
int icici_in=b.getRateofInterest();
int bob_in=c.getRateofInterest();

System.out.println("SBI rate of interest" +sbi_in);
System.out.println("icici rate of interest" + icici_in);
System.out.println("bob rate of interest" + bob_in);
    }
}