import java.util.*;
class Happy_And_TwinPrime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press '1' for checking a Happy Number.");
        System.out.println("Press '2' to find Twin Primes between 1 and N.");
        System.out.println("\nEnter your choice:");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("\nEnter a number:");
            int num=sc.nextInt();
            int n=num;
            int d=0;
            int s1=0,s2=0,sum=0;
            while (n!=0)
            {
                d = n%10;
                s1 = s1+(d*d);
                n = n/10;
            }
            while (s1!=0)
            {
                d = s1%10;
                s2 = s2+(d*d);
                n = n/10;
            }
            while (s2!=0)
            {
                d = s2%10;
                sum = sum+(d*d);
                s2 = s2/10;
            }
            if (sum==1)
            System.out.println(num+" is a Happy Number.");
            else
            System.out.println(num+" is NOT a Happy Number !!");
            break;
            case 2:
            System.out.println("\nEnter the number till which twin primes has to be showed :");
            int N = sc.nextInt();
            int cnt1=0,cnt2=0;
            int a=0;
            System.out.println("\nTwin Primes from 1 to "+N+" are -");
            for (int i=1;i<=N-2;i++)
            {
                cnt1=0;
                cnt2=0;
                for (int j=1;j<=i;j++)
                {
                    if (i%j==0)
                    cnt1++;
                }
                if (cnt1==2)
                {
                    a=i+2;
                    for (int k=1;k<=a;k++)
                    {
                        if (a%k==0)
                        cnt2++;
                    }
                    if (cnt2==2)
                    System.out.println(i+", "+a);
                }
            }
            break;
            default:
            System.out.println("Wrong Choice Entered !!");
        }
    }
}