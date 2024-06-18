import java.io.*;
class NonBlank_Character_Count
{
    static void main()throws IOException
    {
         BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a sentence :-");
         String s=buf.readLine();
         int c=0;
         for (int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             if (ch!=' ')
             c++;
         }
         System.out.println("The number of non-blank characters in the given sentence is =\n"+c);
    }
}
