/**WAP to accept a word. Pass it to a function
 * magic(String x). The function checks the
 * string for the presence of consecutive letters.
 * If two letters are consecutive in any position,
 * the function prints "It s a magic string" otherwise
 * it prints "It is not a magic string".
 */
import java.util.*;
class Function_Magic
{
    void magic(String x)
    {
        int cnt=0;
        x=x.trim();
        x=x.toUpperCase();
        x=x+" ";
        for (int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if (Character.isLetter(ch))
            {
                if ((char)(ch+1)==x.charAt(i+1) || (char)(ch-1)==x.charAt(i+1))
                cnt++;
            }
        }
        if (cnt!=0)
        System.out.println("It is a magic string.");
        else
        System.out.println("It is not a magic string.");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Function_Magic obj=new Function_Magic();
        System.out.println("Enter a string to check if it is magic :");
        String s=sc.nextLine();
        obj.magic(s);
    }
}