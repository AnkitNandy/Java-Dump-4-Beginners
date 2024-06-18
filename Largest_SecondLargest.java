//To find the largest and second largest number from a set of 10 numbers entered by the user
import java.util.*;
class Largest_SecondLargest
{
    static void main()
    {
        Scanner scan=new Scanner(System.in);
        int i,n,largest=0,secondlargest=0;
        System.out.println("Enter 10 integers :-");
        for (i=1;i<=10;i++)
        {
            n=scan.nextInt();
            if (i==1)
            {
                largest=n;
            }
            else 
            {                
            if (n>largest)
            {
                secondlargest=largest;
                largest=n;
            } 
            else if (secondlargest==0)
            secondlargest=n;
            else if (n>secondlargest)
            secondlargest=n;
            }
        }
        System.out.println();
        System.out.println("The largest number is = "+largest);
        System.out.println("The second largest number is = "+secondlargest);        
   }
}
            