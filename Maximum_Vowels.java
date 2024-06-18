/**Input a string and 
 * print the word 
 * containing the maximum
 * number of vowels.
 */
import java.util.*;
class Maximum_Vowels
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=s+" ";
        char c1,c2;
        String str="";
        int maxvowel=0;
        String word="";
        for (int i=0;i<s.length();i++)
        {
            int cnt=0;
            c1=s.charAt(i);
            if (c1!=' ')
            str=str+c1;
            else
            {
                for (int j=0;j<str.length();j++)
                {
                    c2=s.charAt(j);
                    if (c2=='A'||c2=='a'||c2=='E'||c2=='e'||c2=='I'||c2=='i'||c2=='O'||c2=='o'||c2=='U'||c2=='u')
                    cnt++;
                }
                if (cnt>maxvowel)
                {
                    maxvowel=cnt;
                    word=str;
                    str="";
                }
            }
        }
        System.out.println("Word with maximum number of vowels:\n"+word);
    }
}