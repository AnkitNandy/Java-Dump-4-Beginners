import java.util.*;
class NextPrime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        System.out.println("\nPrime Number following "+num+" :");
        int cnt=0;
        while (cnt!=2)
        {
            num++;
            cnt=0;
            for (int i=1;i<=num;i++)
            {
                if (num%i==0)
                cnt++;
            }
        }
        if (cnt==2)
        System.out.println(num);
    }
}