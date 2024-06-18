/**Input a string and print the
 * character which occurs the
 * maximum number of times
 * within the string.
 */
import java.util.*;
class Maximum_Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        int large=0;
        int cnt;
        char ch,frequent=' ';
        s=s.toUpperCase();
        for(ch='A';ch<='Z';ch++) 
        {
            cnt=0;
            for(int i=0;i<s.length();i++) 
            {
                if(s.charAt(i)==ch) 
                {
                    cnt++;
                }
            }
            if(cnt>large) 
            {
                large=cnt;
                frequent=ch;
            }
        }
        System.out.println("Most frequent character =\n"+frequent);
    }
}
        
        