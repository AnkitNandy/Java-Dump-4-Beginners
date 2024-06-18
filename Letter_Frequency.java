/**Accept a string and print the
 * frequency of a given character
 * entered by the user.
 */
import java.util.*;
class Letter_Frequency
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        s=s.trim();
        System.out.println("Enter the character whose frequency you want to find :-");
        char a=sc.next().charAt(0);
        System.out.println();
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==a)
            cnt++;
        }
        System.out.println("Frequency of '"+a+"' is =");
        System.out.println(cnt);
    }
}