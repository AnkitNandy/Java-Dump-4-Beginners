/**Accept a name containing three words and
 * display only the initials.
 */
import java.util.*;
class Initials
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int cnt=0;
        while (cnt!=3)
        {
            System.out.println("Enter a name or a string containing three words :-");
            s=sc.nextLine();
            s=s.trim();
            s=" "+s;
            cnt=0;
            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)==' ')
                cnt++;
            }
            if (cnt!=3)
            System.out.println("It must contain three words\nTry Again.");
        }
        System.out.println();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==' ')
            str=str+s.charAt(i+1)+" ";
        }
        System.out.println("Displaying the initials, we get =\n"+str);
    }
}