/**To accept a name as parameter and
 * print the initial first and then 
 * the title.
 * Example:
 * Ajay Pratap Singh Rathore
 * --> A.P.S.Rathore
 */
import java.io.*;
class Initials3
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string :-");
        String s=buf.readLine();
        s=s.trim();
        String st=s.substring(0,s.lastIndexOf(' '));
        st=" "+st;
        int cnt=0;
        String str="";  
        System.out.println();
        for (int i=0;i<st.length();i++)
        {
            if (st.charAt(i)==' ')
            str=str+st.charAt(i+1)+".";
        }
        System.out.println(str+s.substring(s.lastIndexOf(' ')+1,s.length()));
    }
}