/**Design a class to overload a function series() as follows:
 * (i) double series(double n) with one double argument and
 *     returns the sum of the series.
 *     Sum = (1/1)+(1/2)+(1/3)+..............+(1/n)
 * (ii)double series(double a,double n) with two double
 *     arguments and returns the sum of the series.
 *     Sum = (1/a square)+(4/a power 5)+(7/a power 8)+(10/a power 11)
 *           ..............upto n terms
 */
import java.util.*;
class Function_Series
{
    double series(double n)
    {
        double sum=0.0;
        for (int i=1;i<=n;i++)
        {
            sum=sum+(1.0/i);
        }
        return sum;
    }
    double series(double a,double n)
    {
        double sum=0.0;
        for (int i=1,x=1,y=2;i<=n;i++,x+=3,y+=3)
        {
            sum=sum+(x/Math.pow(a,y));
        }
        return sum;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Function_Series obj=new Function_Series();
        System.out.println("Enter the value of n for the first series:");
        double num=sc.nextDouble();
        double s1=obj.series(num);
        System.out.println("Sum of the first series = "+s1);
        System.out.println("Enter the value of a and n for second series:");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double s2=obj.series(x,y);
        System.out.println("Sum of the second series = "+s2);
    }
}