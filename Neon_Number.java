import java.util.*;
class Neon_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sq = num*num;
        int s=0;
        while (sq!=0)
        {
            int d = sq%10;
            s = s+d;
            sq = sq/10;
        }
        System.out.println();
        if (num == s)
        System.out.println(num+" is a Neon Number.");
        else
        System.out.println(num+" is not a Neon Number !!");
    }
}