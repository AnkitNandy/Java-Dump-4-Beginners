/**Accept a name (Containing three words) and
 * display only the initials (i.e. the first
 * letter of each word).
 */
import java.io.*;
class Initials2
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int cnt=0;
        String str="";
        do
        {
            cnt=0;
            System.out.println("Enter the name of a person in three words :-");
            s=buf.readLine();
            s=s.trim();
            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)==' ')
                cnt++;
            }
            if (cnt!=2)
            System.out.println("You must enter three words.\nTry Again!!");
        }while (cnt!=2);
        System.out.println();
        s=" "+s;
        for (int j=0;j<s.length();j++)
        {
            if (s.charAt(j)==' ')
            str=str+s.charAt(j+1)+" ";
        }
        System.out.println("Initials of given name is =\n"+str);
    }
}