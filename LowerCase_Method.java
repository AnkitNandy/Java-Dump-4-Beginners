import java.util.*;
class LowerCase_Method
{
    String lower(String x)
    {
        String str = x.toLowerCase();
        return(str);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        LowerCase_Method obj = new LowerCase_Method();
        System.out.println("\nGiven input in LowerCase:");
        System.out.println(obj.lower(s));
    }
}