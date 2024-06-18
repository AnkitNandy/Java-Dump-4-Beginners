//Program to print the initials of a string entered by the user
import java.util.*;
class Initials1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        int i;
        s=s.trim();
        s=" "+s;
        //String str="";        
        for (i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            //str=str+s.charAt(i+1)+".";
            System.out.print(s.charAt(i+1)+".");
        }
        //System.out.println(str);
    }
}