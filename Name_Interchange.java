/*To accept a name containing three words
 * and display the surname first, followed
 * by the first and the middle names.
 */
import java.io.*;
class Name_Interchange
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int cnt;
        do
        {
            cnt=0;
            System.out.println("Enter a name containing three words :-");
            s=buf.readLine();
            s=s.trim();
            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)==' ')
                cnt++;
            }
            if (cnt!=2)
            System.out.println("Wrong name entered, it must contain three words.\nTry Again!!");
        }while (cnt!=2);
        System.out.println();
        String str="";
        str=str+s.substring(s.lastIndexOf(' ')+1,s.length())+" "+s.substring(0,s.indexOf(' '))+" "+s.substring(s.indexOf(' ')+1,s.lastIndexOf(' '));
        System.out.println("The new name is =\n"+str);
    }
}