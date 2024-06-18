//To check two strings entered by the user for Laxographic comparison.
import java.util.*;
public class LaxographicStringComparison
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TO COMPARE TWO STRINGS LAXOGRAPHICALLY USING THEIR CORRESPONDING ASCII VALUES");
        System.out.println();
        String s1,s2;
        int n;
        System.out.println("Enter the first string:-");
        s1=sc.nextLine();
        System.out.println("Enter the second string:-");
        s2=sc.nextLine();
        n=s1.compareTo(s2);
        if (n==0)
        System.out.println("Both the strings are THE SAME(Equal).");
        if (n>0)
        System.out.println("String '"+s1+"' is GREATER THAN string '"+s2+"'.");
        if (n<0)
        System.out.println("String '"+s1+"' is LESSER THAN string '"+s2+"'.");
    }
}