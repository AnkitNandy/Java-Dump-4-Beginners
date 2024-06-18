/**Hotel is giving a seasonal discount on the 
 * total amount to be paid by person staying.
 * Charges for different rooms:-
 * Semi Deluxe Room - Rs 2500 per day
 * Deluxe Room - Rs 3500 per day
 * Super Deluxe Room - Rs 5000 per day
 * The discount will be given as per this criteria:-
 * upto 3 days - 10%
 * More than 3 days and upto 5 days - 15%
 * More than 5 days and upto 10 days - 20%
 * More than 10 days - 30%
 */
import java.util.*;
public class Hotel
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to BLUE STAR RESORT!!!");
        System.out.println("Semi Deluxe Room - Rs 2500/day");
        System.out.println("Deluxe Room - Rs 3500/day");
        System.out.println("Super Deluxe Room - Rs 5000/day");
        System.out.println("upto 3 days - 10% discount");
        System.out.println("more than 3 days and upto 5 days - 15% discount");
        System.out.println("more than 5 days and upto 10 days - 20% discount");
        System.out.println("more than 10 days - 30% discount");
        String name;
        int days;
        char category;
        char S,D,X;
        double amt=0,disc=0,fmt=0;
        System.out.println("Enter name of guest:-");
        name=sc.nextLine();
        System.out.println("Enter number of days stayed:-");
        days=sc.nextInt();
        System.out.println("Press S-semi deluxe,D-deluxe,X-super deluxe.");
        category=sc.next().charAt(0);
        if (category=='S')
        {
            if (days<=3&&days>=1)
            {
                amt=2500*days;
                disc=amt*0.10;
                fmt=amt-disc;
            }
            if (days>3&&days<=5)
            {
                amt=2500*days;
                disc=amt*0.15;
                fmt=amt-disc;
            }
            if (days>5&&days<=10)
            {
                amt=2500*days;
                disc=amt*0.20;
                fmt=amt-disc;
            }
            if (days>10)
            {
                amt=2500*days;
                disc=amt*0.30;
                fmt=amt-disc;
            }
        }
        if (category=='D')
        {
            if (days>=1&&days<=3)
            {
                amt=3500*days;
                disc=amt*0.10;
                fmt=amt-disc;
            }
            if (days>3&&days<=5)
            {
                amt=3500*days;
                disc=amt*0.15;
                fmt=amt-disc;
            }
            if (days>5&&days<=10)
            {
                amt=3500*days;
                disc=amt*0.20;
                fmt=amt-disc;
            }
            if (days>10)
            {
                amt=3500*days;
                disc=amt*0.30;
                fmt=amt-disc;
            }
        }
        if (category=='X')
        {
            if (days>=1&&days<=3)
            {
                amt=5000*days;
                disc=amt*0.10;
                fmt=amt-disc;
            }
            if (days>3&&days<=5)
            {
                amt=5000*days;
                disc=amt*0.15;
                fmt=amt-disc;
            }
            if (days>5&&days<=10)
            {
                amt=5000*days;
                disc=amt*0.20;
                fmt=amt-disc;
            }
            if (days>10)
            {
                amt=5000*days;
                disc=amt*0.30;
                fmt=amt-disc;
            }
        }
        else
        System.out.println("Wrong Choice Entered!!"+"\n"+"TRY AGAIN.");
        System.out.println("BILL");
        System.out.println("Name:- "+name);
        System.out.println("Category:-"+category);
        System.out.println("Number of days stayed:-"+days);
        System.out.println("_________________________________________________________");
        System.out.println("Actual amount:- RS."+amt);
        System.out.println("Discount given:-"+"\n"+disc);
        System.out.println("Total amount to be paid:-"+"\n"+"Rs."+fmt);
        System.out.println("THANK YOU FOR STAYING HERE!!!!!!");
    }
}

