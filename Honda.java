import java.util.*;
class Honda
{
    int type,cost;
    double pay;
    void gettype()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("!@#$%^&*WELCOME TO HERO HONDA SHOWROOM*&^%$#@!");
        System.out.println("\nEnter the cost of the vehicle:");
        cost=sc.nextInt();
        System.out.println("Enter the stroke type(Press either 2 or 4):");
        type=sc.nextInt();
    }
    void find()
    {
        if (type==2)
        {
            System.out.println("\nRate of Increment is 10% of the cost.");
            pay = cost + (10.0/100.0)*cost;
        }
        else
        {
            System.out.println("\nRate of increment is 12% of the cost.");
            pay = cost + (12.0/100.0)*cost;
        }
    }
    void printcost()
    {
        if (type==2)
        System.out.println("\nType of Vehicle : 2 stroke engine.");
        else
        System.out.println("\nType of Vehicle : 4 stroke engine.");
        System.out.println("\nNEW COST = RS."+pay);
    }
    static void main()
    {
        Honda obj = new Honda();
        obj.gettype();
        obj.find();
        obj.printcost();
    }
}