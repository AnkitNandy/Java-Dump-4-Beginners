/*To print a series showing the
 * products of two consequtive numbers
 * and then to accept starting number.
 * Stop till product exceeds 
 * accepted limit from the user
 */
import java.util.*;
public class My_First_While_Loop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num;//starting no.
        int lim;//limit for product
        int i=0;
        System.out.println("TO FIND THE PRODUCT OF TWO CONSEQUTIVE NUMBERS."+"\n"+"ACCEPT THE STARTING NUMBER."+"\n"+"STOP TILL PRODUCT EXCEEDS A LIMIT.");
        System.out.println();
        System.out.println("Enter the starting number:-");
        num=sc.nextInt();
        System.out.println("Now, enter the limit till which product is to be displayed:-");
        lim=sc.nextInt();
        System.out.println();
        while(i<(lim-10))
        {
            i=num*(num+1);
            System.out.println(num+" x "+(num+1)+" = "+i+".");    
            num++;
        }
        System.out.println("THE END");
    }
}