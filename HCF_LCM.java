/**To input two integers and then find
 * their Least Common Multiple (LCM)
 * and Highest Common Factor (HCF).
 */
import java.util.*;
public class HCF_LCM
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two integers to find their HCF and LCM :-");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println();
        int product;
        product=a*b;
        int hcf=0,lcm=0;
        for (int i=1;i<=product;i++)
        {
            if (a%i==0 && b%i==0)
            hcf=i;
        }
        lcm=(int)(product/hcf);
        System.out.println("Highest Common Factor (HCF) of "+a+" and "+b+" = "+hcf+", and");
        System.out.println("Least Common Multiple (LCM) of "+a+" and "+b+" = "+lcm+".");
    }
}