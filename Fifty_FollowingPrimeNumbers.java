import java.util.*;
class Fifty_FollowingPrimeNumbers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting no. to begin 50 prime numbers from that point :-");
        int n=sc.nextInt();
        System.out.println("\n50 simultaneous prime numbers from "+n+" are :");
        int cnt=0;
        for (int m=1;m<=50;m++)
        {
            cnt=0;
            for (int a=1;a<=n;a++)
            {
                if (n%a==0)
                cnt++;
            }
            if (cnt==2)
            {
                System.out.println(n);
            }
            n++;
        }
    }
}