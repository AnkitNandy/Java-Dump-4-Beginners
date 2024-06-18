/**Write a program to 
 * generate multiplication table
 * of a number that is based
 * on the input from the user.
 */
import java.util.*;//package name
public class Multiplication_Table
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);//creating scanner object
        int num;//number whose multiplication table must be generated
        int lim;//limit
        int i,prod;
        System.out.println("Enter the number whose multiplication table is to be generated:-");
        num=sc.nextInt();
        System.out.println("Enter the limit till which you want to multiply the number with:-");
        lim=sc.nextInt();
        System.out.println("MULTIPLICATION TABLE OF "+num+" :-");
        for (i=1;i<=lim;i++)
        {
            prod=num*i;
            System.out.println(num+" x "+i+" = "+prod);
        }
        System.out.println("THE END!!");
    }
}