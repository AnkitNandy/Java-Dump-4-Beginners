/**To compute and calculate these 4 problems:
 * Natural logarithm
 * Absolute value
 * Square root
 * Random numbers between 0 and 1
 * of a number entered by user.
 */
import java.util.*;
public class FourEvaluations
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double num;
        System.out.println("Enter the number:-");
        num=sc.nextDouble();
        int choice;
        double a;
        System.out.println("1 - Natural Logarithm");
        System.out.println("2 - Absolute Value");
        System.out.println("3 - Square Root");
        System.out.println("4 - Random nos. between 1 and 2");
        System.out.println("Enter 1, 2, 3 or 4 as per these options:-");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            a=Math.log(num);
            System.out.println("The Natural Logarithm of "+num+" is "+a);
            break;
            case 2:
            a=Math.abs(num);
            System.out.println("The Absolute Value of "+num+" is "+a);
            break;
            case 3:
            a=Math.sqrt(num);
            System.out.println("The Square Root of "+num+" is "+a);
            break;
            case 4:
            a=Math.random();
            System.out.println("Random numbers between 0 and 1:-");
            System.out.println(+a);
            break;
            default:
            System.out.println("Wrong Choice!!!");
        }
    }
}
