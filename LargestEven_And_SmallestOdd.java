//To input 10 integers and display the largest even and smallest odd one.
import java.util.*;
public class LargestEven_And_SmallestOdd
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int num;
        int largest=0,smallest=0;
        System.out.println("Enter ten integers :-");
        for (int i=1;i<=10;i++)
        {
            num=scan.nextInt();
            if (i==1)
            {
                largest=num;
                smallest=num;
            }
            if (num>largest)
            largest=num;
            if (num<smallest)
            smallest=num;
        }
        if (largest%2==0)
        System.out.println("Largest Even Integer = "+largest);
        if (smallest%2!=0)
        System.out.println("Smallest Odd Integer = "+smallest);
    }
}