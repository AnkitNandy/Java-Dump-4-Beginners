/**To find the sum of
 * 'n' number of numbers.
 */
import java.util.*;
class Loop_Sum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a;//number of values entered by the user
        int s=0;//sum
        int num;//numbers entered
        System.out.println("Enter the number of values whose sum you want to find:-");
        a=sc.nextInt();
        System.out.println("Now, Enter "+a+" numbers here:-");
        for (int i=1;i<=a;i++)
        {
        num=sc.nextInt();
        s=s+num;
        }
        System.out.println();
        System.out.println("Sum of these "+a+" numbers:-"+"\n"+s);
    }
}
        