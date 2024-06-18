/**This Java program is to
 * first accept a number from the user
 * and also to accept the number of powers
 * for that number needed to be printed accordingly.
 */ 
import java.util.*;
public class Loop_Powers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TO PRINT GIVEN NUMBER OF POWERS OF A NUMBER");
        System.out.println();
        int num,res,p;
        int i;//res is the result,num is the number entered and p is the no.of powers
        System.out.println("Enter a number whose powers are to be displayed:-");
        num=sc.nextInt();
        System.out.println("Enter the number of powers you want to print for "+num+" :-");
        p=sc.nextInt();
        System.out.println("The "+p+" powers of "+num+" are:-");
        System.out.println();
        for(i=1;i<=p;i++)
        {
            res=(int)(Math.pow(num,i));
            System.out.println(num+" to the power "+i+" = "+res);
        }
    }
}