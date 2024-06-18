/**WAP to take a string as input and display the
 * string in the following format:
 * INPUT : MAN IS MORTAL
 * OUTPUT : MNA SI MRTLOA
 * (First consonants then vowels without 
 * changing the sequence);
 */
import java.util.*;
class FirstConsonantsThenVowels
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        s = s.trim();
        s = s+" ";
        s = s.toUpperCase();
        String str = "",st1 = "",st2="";
        char c1,c2;
        System.out.println("\nOUTPUT:");
        for (int i=0;i<s.length();i++)
        {
            c1 = s.charAt(i);
            if (c1 !=' ')
            {
                str = str+c1;
            }
            else
            {
                for (int j=0;j<str.length();j++)
                {
                    c2 = str.charAt(j);
                    if (c2!='A'&&c2!='E'&&c2!='I'&&c2!='O'&&c2!='U')
                    st1 = st1+c2;
                    else
                    st2 = st2+c2;
                }
                System.out.print(st1+st2+" ");
                str = "";
                st1 = "";
                st2 = "";
            }
        }
    }
}