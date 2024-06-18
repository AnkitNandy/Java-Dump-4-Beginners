/*To accept 'x' different numbers.
 * Display the greatest and smallest numbers
 * from the set of numbers entered as input.
 */
import java.util.*;
class Greatest_Smallest_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many inputs(integers) you want to enter :-");
        int x=sc.nextInt();
        System.out.println("Now, enter "+x+" integers to find the greatest and smallest among them :-");
        int num;
        int min=0,max=0;
        for (int i=1;i<=x;i++)
        {
            num=sc.nextInt();
            if (num>max)
            max=num;
            if (num<min)
            min=num;
        }
        System.out.println();
        System.out.println("The Greatest Number = "+max);
        System.out.println("The Smallest Number = "+min);
    }
}