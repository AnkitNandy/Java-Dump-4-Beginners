/**WAP to input the sides of a triangle.
 * Pass the sides to a function 
 * decide(int x,int y,int z) which
 * checks and prints whether the 
 * triangle is equilateral, isosceles
 * or scalene.
 */
import java.util.*;
class Function_TriangleType
{
    public void decide(int x,int y,int z)
    {
        if (x==y && y==z && z==x)
        System.out.println("\nThe triangle is an EQULATERAL TRIANGLE.");
        else if (x!=y && y!=z && z!=x)
        System.out.println("\nThe triangle is a SCALENE TRIANGLE.");
        else
        System.out.println("\nThe triangle is an ISOSCELES TRIANGLE.");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides of a triangle :-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Function_TriangleType obj=new Function_TriangleType();
        obj.decide(a,b,c);
    }
}