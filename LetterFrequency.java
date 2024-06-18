/**To find the frequency
 * of letters in a string.
 */
import java.io.*;
class LetterFrequency
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string :-");
        String s1=buf.readLine();
        s1=s1.toUpperCase();
        char c;
        System.out.println("Character          Frequency");
        for (c='A';c<='Z';c++)
        {
            int cnt=0;
            for (int i=0;i<s1.length();i++)
            {
                if (s1.charAt(i)==c)
                {
                    cnt++;
                }
            }
            if (cnt>0)
            {
                System.out.println("   "+c+"                    "+cnt);
            }
        }
    }
}