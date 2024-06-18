/**WAP in Java to input a string using upper
 * and lower case characters. Pass the string
 * to a function lower(String x) to print only
 * the lower case characters.
 */
import java.util.*;
class Function_Lower
{
    void lower(String x)
    {
        x=x.trim();
        System.out.println("String to Lower Case:");
        System.out.println(x.toLowerCase());
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Function_Lower obj=new Function_Lower();
        System.out.println("Enter a string having both lowercase and uppercase characters :-");
        String s=sc.nextLine();
        obj.lower(s);
    }
}