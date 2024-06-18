/**Enter a string and display the 
 * longest word and the length of
 * the longest word present in it.
 */
import java.util.*;
class Longest_Word
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=s+" ";
        String large=s.substring(0,s.indexOf(' '));
        String str="";
        int len=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            {
                if (str.length()>large.length())
                {
                    large=str;
                    len=large.length();
                    str="";
                }
            }
            else
            {
                str=str+s.charAt(i);;
            }
        }
        System.out.println("The longest word = "+large+"\n"+"The length of the word = "+len);
    }
}
                