import java.util.*;
class Loan
{
    int time;//in years
    double principal,rate,interest,amt;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount sanctioned for the loan:");
        principal=sc.nextDouble();
        System.out.println("Enter the time in years for which loan is sanctioned:");
        time=sc.nextInt();
    }
    void calculate()
    {
        if (time<=5)
        rate=15;
        else if (time<=10)
        rate=12;
        else
        rate=10;
        interest = (principal*rate*time)/100.0;
        amt = principal+interest;
    }
    void display()
    {
        System.out.println("\n\nINTEREST = Rs."+interest);
        System.out.println("AMOUNT TO BE PAID AFTER "+time+" YEARS = Rs."+amt);
    }
    public static void main()
    {
        Loan obj=new Loan();
        obj.getdata();
        obj.calculate();
        obj.display();
    }
}