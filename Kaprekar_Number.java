/**To input a number and
 * check whether it is a
 * Kaprekar number or not.
 * Take a positive whole number
 * n that has d number of digits.
 * Take the square of n and separate 
 * the result into two pieces: a 
 * right-hand piece that has d digits
 * and a left-hand piece that has either
 * d or d-1 digits. Add these two pieces
 * together. If the result is n, then n is
 * a Kaprekar Number.
 * Example:-
 * 9 (9 square = 81, 8+1 = 9)
 * 45 (45 square = 2025, 20+25 = 45)
 * 297 (297 square = 88209, 88+209 = 297).
 */
import java.util.*;
public class Kaprekar_Number
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integral number :-");
        int num=scan.nextInt();
        System.out.println();
        int square=num*num;
        int sq=square;
        int sq1=square;
        int sq2=square;
        int cnt=0,d;
        int n=num;
        int s1=0,s=0;
        int newnum1=0,newnum2=0;
        while (square!=0)
        {
            d=square%10;
            cnt++;
            square=square/10;
        }
        if (cnt%2==0)
        {
            for (int i=0;i<(int)cnt/2;i++)
            {
                d=sq1%10;
                s=s+(int)Math.pow(10,i)*d;
                sq1=sq1/10;
            }
            newnum1=sq1+s;
        }
        else
        {
            for (int i=0;i<cnt-((int)cnt/2);i++)
            {
                d=sq%10;
                s1=s1+(int)Math.pow(10,i)*d;
                sq2=sq2/10;
            }
            newnum2=sq2+s1;
        }
        if (newnum1==n || newnum2==n)
        System.out.println("Kaprekar Number");
        else
        System.out.println("Not Kaprekar Number.");
    }
}
        