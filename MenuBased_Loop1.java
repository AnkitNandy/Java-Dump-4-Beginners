/**To perform a menu-based program 
 * and perform these tasks:-
 * (i)Accept a number and print its
 * Fibonacci Series upto n number of terms.
 * (ii)Accept a number and print
 * whether the number entered is
 * a palidrome or not.
 */
import java.util.*;
public class MenuBased_Loop1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c;//choice from user
        System.out.println("1.To print Fibonacci Series");
        System.out.println("2.To check whether a number is palindrome or not");
        System.out.println("Press either 1 or 2 on keyboard to perform these tasks.");
        System.out.println();
        System.out.println("Enter your choice:-");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            int n;//no. of terms
            int t1=0,t2=1;//they are 1st two terms in series
            int i;
            int sum;
            System.out.println("FIBONACCI SERIES??");
            System.out.println("Enter the number of terms to be displayed:-");
            n=sc.nextInt();
            System.out.println("First "+n+" terms of the Fibonacci Series:-");
            i=1;
            while(i<=n)
            {
                sum=t1+t2;
                t1=t2;
                t2=sum;
                System.out.println(+t1);
                i++;
            }
            System.out.println("THE END!!");
            break;
            case 2:
            int num;//number entered
            int d;
            int rev=0;//reverse
            int a;//=num
            System.out.println("PALINDROME OR NOT??");
            System.out.println("Enter a number:-");
            num=sc.nextInt();
            a=num;
            while(num>0)
            {
                d=num%10;
                rev=rev*10+d;
                num=num/10;
            }
            if (a==rev)
            System.out.println(a+" is a Palindrome Number.");
            else
            System.out.println(a+" is not a Palindrome Number.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!"+"\n"+"Try Again.");
        }        
    }
}