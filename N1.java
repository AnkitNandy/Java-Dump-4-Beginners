/**Design a class Number having the following 
 * description:
 * Instance Variables
 * int num : to store a number
 * int p : to calculate the product of 
 *         first and last digit of
 *         number stored in num
 * 
 * Method
 * Number() : to initialize num ro 0 and p to 1
 * input() : to store num.
 * product() : to calculate product of first
 *             and last digit of number stored
 *             in num.
 * 
 * Create an object in the main method and call
 * all the above methods in it.
 */
import java.util.*;
class N1
{
    int num;
    int p;
    N1()
    {
        num=0;
        p=1;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
    }
    void product()
    {
        int last=num%10;
        int d=0;
        int n=num;
        while (n!=0)
        {
            d=n%10;
            n=n/10;
        }
        int first=d;
        p=first*last;
        System.out.println("Product of first and last digits:\n"+p);        
    }
    public static void main()
    {
        N1 obj=new N1();
        obj.input();
        obj.product();
    }
}