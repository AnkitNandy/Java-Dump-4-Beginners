/*To input a number for a
 * corresponding month and then
 * find the number of days in it
 */
import java.util.*;
public class Months
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num,yr;
        System.out.println("0 for exit");
        System.out.println("1 to 12 for corresponding month");
        System.out.println("Enter number from 0 to 12:-");
        num=sc.nextInt();
        switch(num)
        {
            case 0:
            System.exit(0);
            case 1:
            System.out.println("The month is January."+"\n"+"It has 31 days");
            break;
            case 3:
            System.out.println("The month is March."+"\n"+"It has 31 days");
            break;
            case 5:
            System.out.println("The month is May."+"\n"+"It has 31 days.");
            break;
            case 7:
            System.out.println("The month is July."+"\n"+"It has 31 days.");
            break;
            case 8:
            System.out.println("The month is August."+"\n"+"It has 31 days.");
            break;
            case 10:
            System.out.println("The month is October."+"\n"+"It has 31 days.");
            break;
            case 12:
            System.out.println("The month is December."+"\n"+"It has 31 days.");
            break;
            case 4:
            System.out.println("The month is April."+"\n"+"It has 30 days.");
            break;
            case 6:
            System.out.println("The month is June."+"\n"+"It has 30 days.");
            break;
            case 9:
            System.out.println("The month is September."+"\n"+"It has 30 days");
            break;
            case 11:
            System.out.println("The month is November."+"\n"+"It has 30 days.");
            break;
            case 2:
            System.out.println("The month is February.");
            System.out.println("Enter the year to find no of days in february:-");
            yr=sc.nextInt();
            {
                if (yr%4==0)
                System.out.println("February has 29 days.");
                else
                System.out.println("February has 28 days.");
            }
            break;
            default:
            System.out.println("You have entered a wrong number.");
        }
    }
}
       