import java.util.*;
class MaxVowel_Word
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String word="",str="";
        int cnt=0,max=0;
        s = s.trim();
        s = s+" ";
        for (int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch!=' ')
            {
                str = str+ch;
                if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
                    ||ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o')
                cnt++;
            }
            else
            {
                if (cnt>max)
                word = str;
                cnt = 0;
                str = "";
            }
        }
        System.out.println("\nThe word with maximum no. of vowels : "+word);
    }
}