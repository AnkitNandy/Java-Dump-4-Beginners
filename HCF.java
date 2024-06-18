/**To accept two integral numbers
 * from the user using Scanner Class.
 * Compute and display the Highest Common Factor
 * and even the Least Common Multiple
 * of those two numbers based on user's choice.
 */
import java.util.*;
public class HCF
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;//input
        int c;//choice
        int i,p,hcf=0,lcm=0;//p is product and hcf is the result
        System.out.println("TO FIND THE HCF or LCM OF TWO NUMBERS");
        System.out.println();
        System.out.println("Enter two integral numbers:-");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Press 1 to find their HCF and 2 to find their LCM.");
        System.out.println();
        System.out.println("Enter your choice:-");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            p=a*b;
            for(i=1;i<p;i++)
            {
               if (a%i==0&&b%i==0)
               hcf=i;
            }
            System.out.println("The HCF or GCD of "+a+" and "+b+" is:-"+"\n"+hcf);
            break;
            case 2:
            p=a*b;
            for(i=1;i<p;i++)
            {
               if (a%i==0&&b%i==0)
               hcf=i;
            }
            lcm=(a*b)/hcf;
            System.out.println("The LCM of "+a+" and "+b+" is:-"+"\n"+lcm);
            break;
            default:
            System.out.println("Wrong Choice Entered!!"+"\n"+"Try Again.");
        }
    }
}
            
    