/**192*1=192
 * 192*2=384
 * 192*3=576
 * After concatenating the results, we get all the digits
 * from 1 to 9 in 192384576.
 */
import java.util.*;
class Fascinating_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int a=n*2;
        int b=n*3;
        String s1=Integer.toString(n);
        String s2=Integer.toString(a);
        String s3=Integer.toString(b);
        String s=s1+s2+s3;
        long number=Long.valueOf(s);
        int cnt=0,flag=0;
        long num,d;
        for (int i=1;i<=9;i++)
        {
            cnt=0;
            num=number;
            while (num!=0)
            {
                d=num%10;
                if (d==i)
                cnt++;
                num=num/10;
            }
            if (cnt==1)
            flag++;
        }
        if (flag==9 && n>=100)
        System.out.println(n+" is a Fascinating Number.");
        else
        System.out.println(n+" is not a Fascinating Number!!");
    }
}