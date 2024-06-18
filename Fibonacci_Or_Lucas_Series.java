/**Program to print the 
 * first ten terms of the
 * Fibonacci (Lucas) Series,
 * i.e.1,1,2,3,5,8,13,.... .
 * Lucas Series is such a series
 * which starting from 1 and 1,
 * and subsequent numbers are the
 * sum of previous two numbers.
 */
public class Fibonacci_Or_Lucas_Series
{
    public static void main()
    {
        int a=1,b=1;
        int sum=0;
        System.out.println("First 10 terms of the Fibonacci (Lucas) Series :-");
        System.out.print(a+", "+b+", ");
        for (int i=1;i<=8;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            if (i==8)
            System.out.print(sum+".");
            else
            System.out.print(sum+", ");
        }
    }
}