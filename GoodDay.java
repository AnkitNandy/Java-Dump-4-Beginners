/*This program is to display
 * Good Morning, Good Afternoon,
 * Good Evening and Good Night 
 * based upon the user's choice
 */
import java.util.*;
public class GoodDay
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Press 1,2,3,or 4 here");
        System.out.println("Enter your choice to reveal the secret message behind it:-");
        a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("GOOD MORNING");
            break;
            case 2:
            System.out.println("GOOD AFTERNOON");
            break;
            case 3:
            System.out.println("GOOD EVENING");
            break;
            case 4:
            System.out.println("GOOD NIGHT");
            break;
            default:
            System.out.println("Wrong Choice Made!!!!!");
        }
    }
}