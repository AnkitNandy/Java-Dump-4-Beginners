/**Special bonanza for early booking of flats for customers as per this tariff:
 * CATEGORY          DISCOUNT ON PRICE          DISCOUNT ON DEVELOPMENT CHARGE
 * ground floor           - 10%                              - 8%
 * first floor            - 2.0%                             - 1.0%
 * second floor           - 5%                               - 5%
 * third floor            - 7.5%                             - 10%
 * Input price and category. Calculate and display 
 * the total discount and price of flat after getting discount.
 */
import java.util.*;
public class FlatBooking
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int price;
        System.out.println("Enter price of flat in Rs:-");
        price=sc.nextInt();
        int option;
        double disc1=0,disc2=0,disc=0,amt=0;
        System.out.println("0 for ground floor");
        System.out.println("1 for first floor");
        System.out.println("2 for second floor");
        System.out.println("3 for third floor");
        System.out.println("Enter your choice out of 0, 1, 2 and 3:-");
        option=sc.nextInt();
        switch(option)
        {
            case 0:
            disc1=price*0.10;
            disc2=price*0.08;
            disc=disc1+disc2;
            amt=price-disc;
            break;
            case 1:
            disc1=price*0.02;
            disc2=price*0.01;
            disc=disc1+disc2;
            amt=price-disc;
            break;
            case 2:
            disc1=price*0.05;
            disc2=price*0.05;
            disc=disc1+disc2;
            amt=price-disc;
            break;
            case 3:
            disc1=price*0.075;
            disc2=price*0.10;
            disc=disc1+disc2;
            amt=price-disc;
            break;
            default:
            System.out.println("Wrong Choice!!!");
        }
        System.out.println("Total discount is "+disc+"%.");
        System.out.println("After getting discount, flat's price is Rs "+amt);
    }
}
 