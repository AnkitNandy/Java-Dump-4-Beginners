//Pg 434 -> Question 2
import java.util.*;
class Laptop
{
    static String name;
    static double dis,price,amt;
    Laptop(String s,double p)
    {
        name=s;
        price=p;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the laptop Customer:");
        name=sc.next();
        System.out.println("Enter its Cost Price:");
        price=sc.nextDouble();
    }
    void compute()
    {
        if (price<=25000)
        dis = (5.0/100.0)*price;
        else if (price<=50000)
        dis = (7.5/100.0)*price;
        else if (price<=100000)
        dis = (10.0/100.0)*price;
        else
        dis = (15.0/100.0)*price;
        amt = price-dis;
    }
    void display()
    {
        System.out.println("\nNAME : "+name);
        System.out.println("\nDISCOUNT : Rs."+dis);
        System.out.println("AMOUNT : Rs."+amt);
    }
    public static void main()
    {
        Laptop object = new Laptop(name,price);
        object.accept();
        object.compute();
        object.display();
    }
}