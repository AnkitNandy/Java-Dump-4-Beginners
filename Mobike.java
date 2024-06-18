/**Input customer's name, phone number,
 * bike number and number of days bike is taken out on rent.
 * Calculate rental charges of a customer with this description:
 * For first 5 days - Rs 500/day
 * For next 5 days  - Rs 400/day
 * Rest of the days - Rs 200/day
 */
import java.util.*;
public class Mobike
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int bno,days;
        long pno;
        double charge=0;
        System.out.println("Enter customer's name:-");
        name=sc.nextLine();
        System.out.println("Enter "+name+"'s phone number:-(Ten digits)"); 
        pno=sc.nextLong();
        System.out.println("Enter bike number of "+name+" :-");
        bno=sc.nextInt();
        System.out.println("Enter the number of days for which bike is taken out on rent:-");
        days=sc.nextInt();
        if (days>0&&days<=5)
        charge=500*days;
        else if (days>5&&days<=10)
        charge=(500*5)+(days-5)*400;
        else if (days>10)
        charge=(500*5)+(400*5)+(days-10)*200;
        else
        System.out.println("Wrong number of days entered");
        System.out.println("_______________________________________________________________________________________________________________________________________");
        System.out.println("BILL:-");
        System.out.println("Bike No.     Phone No.     Name     No. Of Days     Charge");
        System.out.println("   "+bno);
        System.out.println("              "+pno);
        System.out.println("                            "+name);
        System.out.println("                                        "+days);
        System.out.println("                                                    Rs "+charge);
    }
}
