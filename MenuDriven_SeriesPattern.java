/**Write a menu-driven program which allows the user
 * to get either:
 * (a) The sum of the following series:
 *     S = (a-2) - (2a+3) + (3a-4) - (4a+5)......upto n terms.
 * (b) To print the following pattern:
 *     1
 *     2 2
 *     3 3 3
 *     4 4 4 4
 *     5 5 5 5 5.......'n' lines.
 *     
 *(c) To print the following pattern:
 *    2
 *    5 10
 *    17 26 37
 *    50 65 82 101
 *    122 145 170 197 226.
 */
import java.util.*;
class MenuDriven_SeriesPattern
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 'a' to print sum of first series.");
        System.out.println("Press 'b' to print the second pattern.");
        System.out.println("Press 'c' to print the third pattern.");
        System.out.println("\nEnter your choice:");
        char ch = sc.next().charAt(0);
        int n;
        switch(ch)
        {
            case 'a':
            case 'A':
            System.out.println("Enter the value of 'n' for the first series:");
            n = sc.nextInt();
            System.out.println("Enter the value of 'a':");
            int a = sc.nextInt();
            int s = 0;
            for (int i=1;i<=n;i++)
            {
                if (i%2!=0)
                s = s + ((i*a)-(i+1));
                else
                s = s - ((i*a)+(i+1));
            }
            System.out.println("\nSum of the first series = "+s);
            break;
            case 'b':
            case 'B':
            System.out.println("Enter the number of lines in second pattern:");
            n = sc.nextInt();
            System.out.println("\nRequired Second Pattern is:-");
            for (int i=1;i<=n;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            break;
            case 'c':
            case 'C':
            System.out.println("\nThe required third pattern is:-");
            int x=2,y=3;
            for (int i=1;i<=5;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(x+" ");
                    x = x+y;
                    y+=2;
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice Entered !!");
        }
    }
}