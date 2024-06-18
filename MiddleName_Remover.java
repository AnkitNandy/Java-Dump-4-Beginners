/**A computer typist has the habit of deleting 
 * the middle name, while entering the names
 * containing three words. WAP to enter a name
 * with three words and display the new name
 * after deleting the middle name.
 */
import java.util.*;
class MiddleName_Remover
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
        s=s.trim();
        String str=s.substring(0,s.indexOf(' '))+s.substring(s.lastIndexOf(' '));
        System.out.println(str);
    }
}