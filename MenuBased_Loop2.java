/**Menu-Based Java Program to -
 * (i)To find whether a no. is automorphic or not
 * (ii)To find whether a no. is perfect or not.
 */

import java.util.*;
public class MenuBased_Loop2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c;
        int num,n,cnt=0,digit,sq,lastdigits;//first choice
        int number,sum=0,i;//second choice
        System.out.println("1)AUTOMORPHIC OR NOT??");
        System.out.println("2)PERFECT OR NOT??");
        System.out.println();
        System.out.println("Press 1 or 2 for any of these tasks.");
        System.out.println("Enter your choice:-");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("AUTOMORPHIC OR NOT??");
            System.out.println("Automorphic means a no. which is contained in the last two digits of its square.");
            System.out.println();
            System.out.println("Enter a number:-");
            n=sc.nextInt();
            num=n;
            sq=n*n;
            while(n > 0)
            {
                digit = n % 10;
                cnt++;
                n = n / 10;
            }
            lastdigits=(int)(sq % Math.pow( 10,cnt ));
            if (lastdigits==num)
            System.out.println(num+" is an Automorphic Number.");
            else
            System.out.println(num+" is not an Automorphic Number.");
            break;
            case 2:
            System.out.println("PERFECT NUMBER OR NOT??");
            System.out.println("Enter any integer you want to check:-");
            number = sc.nextInt();
            for(i = 1; i < number; i++)
            {        
                if(number % i == 0)
                {
                    sum = sum + i;
                }
            }
            if(sum == number)
            {
                System.out.println(number+" is a Perfect Number.");
            }
            else
            {
                System.out.println(number+" is not a Perfect Number.");
            }
            break;
            default:
            System.out.println("Wrong Choice Made!!"+"\n"+"Try Again.");
        }
    }
}       