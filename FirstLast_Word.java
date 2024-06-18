//To print the first word and the last word of a sentence entered by the user
import java.io.*;
class FirstLast_Word
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence :-");
        String s=buf.readLine();
        s=s.trim();
        String str="";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
            {
                str=str+s.charAt(i);
            }
            else
            break;
        }
        System.out.println("First Word = "+str);
        str="";
        for (int j=s.length()-1;j>=0;j--)
        {
            if (s.charAt(j)!=' ')
            {
                str=s.charAt(j)+str;
            }
            else
            break;
        }
        System.out.println("Last Word = "+str);
        //str=str+"First Word:"+s.substring(0,s.indexOf(' '))+" Last Word:"+s.substring(s.lastIndexOf(' ')+1,s.length());
        //System.out.println(str);
    }
}