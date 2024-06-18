/**Design a class to overload a function compare() as follows :-
 * (i) void compare(int, int) : to compare two integer values
 *                              and print the greater of two
 *                              numbers.
 * (ii)void compare(char, char) : to compare the numeric value of 
 *                                two characters and print with
 *                                the higher numeric value.
 * (iii)void compare(String, String) : to compare the length of the 
 *                                     two strings and print the
 *                                     longer of the two.
 */
import java.util.*;
class Function_Compare
{
    void compare(int a,int b)
    {
        if (a>b)
        System.out.println("The greater integer is "+a);
        else
        System.out.println("The greater integer is "+b);
    }
    void compare(char c1,char c2)
    {
        if ((int)c1>(int)c2)
        System.out.println("Character with higher numeric value is "+c1);
        else
        System.out.println("Character with higher numeric value is "+c2);
    }
    void compare(String s1,String s2)
    {
        if (s1.length()>s2.length())
        System.out.println("Longer string :\n"+s1);
        else
        System.out.println("Longer string :\n"+s2);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Function_Compare obj=new Function_Compare();
        System.out.println("Enter two integer values:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        obj.compare(x,y);
        System.out.println("\nEnter two characters:");
        char m=sc.next().charAt(0);
        char n=sc.next().charAt(0);
        obj.compare(m,n);
        System.out.println("\nEnter two strings:");
        String c=sc.next();
        String d=sc.next();
        obj.compare(c,d);
    }
}