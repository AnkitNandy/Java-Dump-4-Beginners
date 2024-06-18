/**Using scanner class,
 * for loop, and case structures,
 * input the number of values that
 * the user wants to operate and then
 * either add, subtract, multiply  or divide
 * based upon the choice of the user.
 */
import java.util.*;//package name
public class LoopOperations
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);//creating scanner class
        int a,i=1;//a is number of values entered by the user
        char c;//c stands for choice
        System.out.println("TO OPERATE THE ENTERED VALUES");
        System.out.println();
        System.out.println("Enter the number of values you want to enter:-");
        a=sc.nextInt();
        double num=0,s=0,p=i,d=num;//s is sum, p is product and d is difference
        System.out.println("Now, enter "+a+" values here:-");
        for(i=1;i<=a;i++)
        {
            num=sc.nextDouble();
            s=s+num;
            p=p*num;
            d=d-num;
        }
        System.out.println("Press '+' for adding them.");
        System.out.println("Press '-' for subtracting them.");
        System.out.println("Press 'x' for multiplying them.");
        System.out.println("Enter your choice:-");
        c=sc.next().charAt(0);
        switch(c)
        {
            case '+':
            System.out.println("Addition??");
            System.out.println("Sum:-"+"\n"+s);
            break;
            case '-':
            System.out.println("Subtraction??");
            System.out.println("Difference:-"+"\n"+d);
            break;
            case 'x':
            System.out.println("Multiplication??");
            System.out.println("Product:-"+"\n"+p);
            break;
            default:
            System.out.println("Wrong Choice entered by you!!!!!");
            System.out.println("Try it again.");
        }
    }
}