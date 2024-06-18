/*To accept a number and 
 * check whether it is 
 * present in the Fibonacci Series
 * or not.
 */
class Fibonacci_Presence
{
    static void main(int num)
    {
       int a=0,b=1,sum=0;
       while (sum<num)
       {    
            sum=a+b;
            a=b;
            b=sum;
       } 
       if (num==sum)
       System.out.println(num+" is PRESENT IN THE FIBONACCI SERIES.");
       else
       System.out.println(num+" is ABSENT IN THE FIBONACCI SERIES.");
    }
}