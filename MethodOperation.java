import java.util.*;
public class MethodOperation
{
    int a,b,sum,diff,prod,div,rem;
    public void InputData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first integer:-");
        a=scan.nextInt();
        System.out.println("Enter the second integer:-");
        b=scan.nextInt();
    }
    public void Add()
    {
        sum=a+b;
        System.out.println("Sum:-"+sum);
    }
    public void Subtract()
    {
        diff=a-b;
        System.out.println("Difference:-"+diff);
    }
    public void Multiply()
    {
        prod=a*b;
        System.out.println("Product:-"+prod);
    }
    public void Quotient()
    {
        div=a/b;
        System.out.println("Quotient:-"+div);
    }
    public void Remainder()
    {
        rem=a%b;
        System.out.println("Remainder:-"+rem);
    }
    public static void main()
    {
        MethodOperation object=new MethodOperation();
        object.InputData();
        object.Add();
        object.Subtract();
        object.Multiply();
        object.Quotient();
        object.Remainder();
    }
}