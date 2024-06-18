import java.util.*;
class MenuDriven_Series
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press '1' to print the Tribonacci Series upto 10 terms:-");
        System.out.println("Press '2' to print the sum of a series.");
        System.out.println("\nEnter your choice:");
        int choice=sc.nextInt();
        int a,b,c;
        switch(choice)
        {
            case 1:
            a=0;
            b=0;
            c=1;
            System.out.println("The Ten Terms of the Tribonacci Series are:");
            System.out.print(a+", "+b+", "+c+", ");
            int sum = 0;
            for (int i=4;i<=10;i++)
            {
                sum = a+b+c;
                a=b;
                b=c;
                c=sum;
                if (i==10)
                System.out.print(sum+".");
                else
                System.out.print(sum+", ");
            }
            break;
            case 2:
            System.out.println("Given, Series:");
            System.out.println("(5/root 2) + (10/root 4) + (15/root 6), upto 'n' terms");
            System.out.println("\nEnter the number of terms('n'):-");
            int n=sc.nextInt();
            a=5;b=2;
            double s=0.0;
            for (int i=1;i<=n;i++,a+=5,b+=2)
            {
                s = s + a/(Math.sqrt(b));
            }
            System.out.println("\nSum of "+n+" terms of the series : "+s);
            break;
            default:
            System.out.println("Wrong Choice Entered !!");
        }
    }
}