/**WAP to input 10 numbers.
 * Use a function to find
 * and print the cube of
 * each number.
 */
import java.util.*;
class Function_Cube
{
    void cube(double n)
    {
        double res=n*n*n;
        System.out.println("Cube of "+(int)(n)+" = "+res);
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        double num[]=new double[10];
        System.out.println("Enter ten (10) numbers:");
        int i;
        for (i=0;i<10;i++)
        num[i]=sc.nextDouble();
        Function_Cube obj=new Function_Cube();
        for (i=0;i<10;i++)
        {
            obj.cube(num[i]);
            System.out.println();
        }
    }
}