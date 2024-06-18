/**WAP to accept a string. Pass it to a function
 * freq(String x). The function finds and prints
 * the frequency of each vowel.
 */
import java.util.*;
class Function_Frequency
{
    void freq(String x)
    {
        x=x.toUpperCase();
        x=x.trim();
        int a=0,e=0,i=0,o=0,u=0;
        for (int p=0;p<x.length();p++)
        {
            char ch=x.charAt(p);
            if (ch=='A')
            a++;
            if (ch=='E')
            e++;
            if (ch=='I')
            i++;
            if (ch=='O')
            o++;
            if (ch=='U')
            u++;
        }
        System.out.println("Frequency of A = "+a);
        System.out.println("Frequency of E = "+e);
        System.out.println("Frequency of I = "+i);
        System.out.println("Frequency of O = "+o);
        System.out.println("Frequency of U = "+u);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Function_Frequency obj=new Function_Frequency();
        System.out.println("Enter a string to find the frequency of its frequency:-");
        String s=sc.nextLine();
        System.out.println();
        obj.freq(s);
    }
}