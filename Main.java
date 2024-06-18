import java.util.*;
class Sentence
{
    private String s;
    Sentence(String s1)
    {
        s=s1;
    }
    boolean Palindrome(String word)
    {
        String str="";
        for (int i=word.length()-1;i>=0;i--)
        {
            str=str+word.charAt(i);
        }
        if (str.equalsIgnoreCase(word))
        return true;
        else
        return false;
    }
    String longestpalindrome()
    {
        String a="",b="",longest="";
        int cnt=0,max=0;
        s=s.trim();
        s=s+" ";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            {
                for (int j=a.length()-1;j>=0;j--)
                {
                    b=b+a.charAt(j);
                }
                if (b.equalsIgnoreCase(a))
                {
                    cnt=a.length();
                    if (cnt>max)
                    {
                        longest=a;
                    }                    
                }
                a="";
            }
            else
            {
                a=a+s.charAt(i);
            }
            b="";
        }
        return longest;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=sc.nextLine();
        Sentence obj=new Sentence(input);
        System.out.println("Enter a word:");
        String word=sc.next();
        boolean d=obj.Palindrome(word);
        System.out.println("The entered word checked for palindrome is "+d+".");
        String e=obj.longestpalindrome();
        System.out.println("The longest palindrome word in the sentence is "+e);
    }
}