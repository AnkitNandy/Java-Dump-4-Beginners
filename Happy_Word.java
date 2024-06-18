/**A happy word is defined as:-
 * Take a word and calculate the
 * word's value based on position
 * of the letters in English Alphabet.
 * On the basis of word's value, 
 * find the sum of the squares of 
 * its digits. Repeat the process
 * with the resultant number until 
 * the number equals 1(one). If the
 * number ends with 1, then it is
 * called a 'Happy Word'. WAP to
 * input a word and check whether
 * it is a 'Happy Word' or not.
 * The program displays the message 
 * accordingly.
 */
import java.util.*;
class Happy_Word
{
    public static void main() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=s.toUpperCase();
        String s1="";
        int pos;
        char ch;
        for(int i=0;i<s.length();i++) 
        {
            ch=s.charAt(i);
            pos=ch-64;
            s1=s1+pos;
        }
        int n=Integer.valueOf(s1);
        while (n>9)
        {
            int s2=0;
            int d;
            while(n!=0) 
            {
                d=n%10;
                s2=s2+(d*d);
                n=n/10;
            }
            n=s2;
        }        
        if(n==1) 
        {
            System.out.println("A Happy Word");
        }
        else 
        {
            System.out.println("Not a Happy Word!!");
        }
    }
}