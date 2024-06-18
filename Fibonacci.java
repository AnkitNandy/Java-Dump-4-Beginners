/**To print the famous
 * Fibonacci Series according
 * to the number of terms entered
 * by the user.
 */
import java.util.*;//package name
public class Fibonacci 
{
    public static void main()//main method 
    {
        Scanner sc=new Scanner(System.in);//creating Scanner object
        int n;//n stands for the number of terms 
        int t1=0,t2=1;//they are the first two terms in the series
        int i,sum;
        System.out.println("TO PRINT THE FIBONACCI SERIES");
        System.out.println();
        System.out.println("Enter the number of terms to be displayed:-");
        n=sc.nextInt();
        System.out.println("First " +n+ " terms of the Fibonacci Series:-");
        for (i=1; i<=n;i++)
        {
            sum=t1+t2;
            t1=t2;
            t2=sum;
            System.out.print(t1+"\n");
        }
    }
}