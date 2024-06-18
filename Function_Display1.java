/**Design a class to overload function display(....) as follows:-
 * (i) void display(int num) : checks and prints whether the number
 *                             is a perfect square or not.
 * (ii)void display(String str,char ch) : checks and prints if the word
 *                                        str contains letter ch or not.
 * (iii) void display(String str) : checks and print the number of
 *                                  special characters present in str.
 * Write a suitable main() function.
 */
import java.util.*;
class Function_Display1
{
    void display(int num)
    {
        if (Math.sqrt(num)%1==0)
        System.out.println(num+" is a perfect square.");
        else
        System.out.println(num+" is not a perfect square!!");
    }
    void display(String str,char ch)
    {
        int f=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==ch)
            f=1;
        }
        if (f==1)
        System.out.println("The word "+str+" contains the letter "+ch+".");
        else
        System.out.println("The word "+str+" does not contain the letter "+ch+" !!");
    }
    void display(String str)
    {
        int cnt=0;
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (Character.isDigit(ch)==false)
            {
                if (Character.isLetter(ch)==false)
                cnt++;
            }
        }
        System.out.println("There are "+cnt+" special characters present in "+str+".");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Function_Display1 obj=new Function_Display1();
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        obj.display(n);
        System.out.println("\nEnter a word:");
        String s=sc.next();
        System.out.println("Enter a character:");
        char m=sc.next().charAt(0);
        obj.display(s,m);
        System.out.println("Enter a word:");
        s=sc.next();
        obj.display(s);
    }
}