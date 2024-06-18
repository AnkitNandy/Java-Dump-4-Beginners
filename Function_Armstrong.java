/**WAP to input a number. Use a number
 * int Armstrong(int n) to receive the
 * number. The function returns 1 if
 * the number is Armstrong, otherwise 0.
 */
import java.util.*;
class Function_Armstrong
{
    int Armstrong(int n)
    {
        int a=n,d,sum=0;
        while (a!=0)
        {
            d=a%10;
            sum=sum+(d*d*d);
            a=a/10;
        }
        if (sum==n)
        return 1;
        else
        return 0;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        Function_Armstrong obj=new Function_Armstrong();
        int res=obj.Armstrong(num);
        if (res==1)
        System.out.println(num+" is an Armstrong Number.");
        else
        System.out.println(num+" is not an Armstrong Number!!");
    }
}