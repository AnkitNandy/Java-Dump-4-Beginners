/**Design a class to overload the function display(....)as follows:
 * (i) void display(String str,char ch) : checks whether the word str contains
 *                                        the letter ch at the beginning and 
 *                                        at the end or not. If present,
 *                                        print 'Special Word' otherwise not.
 * (ii) void display(String str1,String str2) : checks and prints whether both
 *                                              the words are equal or not.
 * (iii) void display(String str,int n) : prints the character present at n th
 *                                        position in the word str.
 * Write a suitable main() function.
*/
import java.util.*;
class Function_Display2
{
    void display(String str,char ch)
    {
        str=str.trim();
        if (str.charAt(0)==ch)
        {
            if (str.charAt(str.length()-1)==ch)
            System.out.println("It is a Special Word.");
        }
        else
        System.out.println("It is not a special word.");
    }
    void display(String str1,String str2)
    {
        if (str1.equalsIgnoreCase(str2))
        System.out.println("Both the words are equal.");
        else
        System.out.println("Both the words are not equal!!");
    }
    void display(String str,int n)
    {
        System.out.println("Character "+str.charAt(n)+" is present at position "+n+".");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s,a,b;
        int num;
        char m;
        Function_Display2 obj=new Function_Display2();
        System.out.println("Enter a word:");
        s=sc.next();
        System.out.println("Enter a character:");
        m=sc.next().charAt(0);
        obj.display(s,m);
        System.out.println("\nEnter two words:");
        a=sc.next();
        b=sc.next();
        obj.display(a,b);
        System.out.println("\nEnter a word:");
        s=sc.next();
        System.out.println("Enter the position number:");
        num=sc.nextInt();
        obj.display(s,num);
    }
}