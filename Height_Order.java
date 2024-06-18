import java.util.*;
class Height_Order
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of heights of people\nyou would like to enter :");
        int n=sc.nextInt();
        System.out.println();
        double h[]=new double[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("\nEnter a height:");
            h[i]=sc.nextDouble();
        }
        System.out.println("\nPress 'A' or 'a' to sort their height in ascending order.");
        System.out.println("Press 'D' or 'd' to sort their height in descending order.");
        System.out.println("\nEnter your choice:");
        char ch=sc.next().charAt(0);
        int index=0;
        double swap=0.0;
        for (int i=0;i<n-1;i++)
        {
            index=i;
            if (ch=='A'||ch=='a')
            {
                System.out.println("\nHeights in ascending order:");
                for (int j=i+1;j<n;j++)
                {
                    if (h[j]<h[index])
                    index=j;
                }
            }
            else if (ch=='D'||ch=='d')
            {
                System.out.println("\nHeights in descending order:");
                for (int j=i+1;j<n;j++)
                {
                    if (h[j]>h[index])
                    index=j;
                }
            }
            else
            {
                System.out.println("\nWrong choice entered!! Try Again....");
                System.exit(0);
            }
            swap=h[i];
            h[i]=h[index];
            h[index]=swap;
        }
        for (int i=0;i<n;i++)
        System.out.println(h[i]);
    }
}