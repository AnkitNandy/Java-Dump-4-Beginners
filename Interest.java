package Tution;

//Pg 406 -> QUestion 13 in textbook
import java.util.*;
class Interest//class name different than as mentioned in question
{
    int time;
    double principal,rate,interest,amt;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        principal = sc.nextDouble();
        System.out.println("Enter the Time in whole number of years:");
        time = sc.nextInt();
    }
    void calculate()
    {
        if (time<=5)
        rate = (15.0/100.0)*principal;
        else if (time<=10)
        rate = (12.0/100.0)*principal;
        else
        rate = (10.0/100.0)*principal;
        interest = (principal*rate*time)/100.0;
        amt = principal+interest;
    }
    void display()
    {
        System.out.println("\nInterest Charged by Trust Bank : Rs."+interest);
        System.out.println("\nAmount to be Paid after "+time+" years : Rs."+amt);
    }
    public static void main()
    {
        Interest object = new Interest();
        object.getdata();
        object.calculate();
        object.display();
    }
    }