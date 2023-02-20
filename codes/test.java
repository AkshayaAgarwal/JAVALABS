class test
{
int patientid;
public int doctorid;
private int payment;
void setc(int i)
{
payment = i;
}
int getc()
{
return payment;
}
}
class accessspecifie
{
public static void main(String args[])
{
test ob=new test();
ob.patientid=10;
ob.doctorid=20;
ob.payment=1000;
ob.setc(1000);
System.out.println("patient_id,doctor_id and payment"+ob.patientid+""+ob.doctorid+" "+ob.getc());
}
}