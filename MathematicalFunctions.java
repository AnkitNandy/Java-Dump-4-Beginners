//A program to show the use of Mathematical Functions
import java.util.*;
public class MathematicalFunctions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double m;
        m=sc.nextDouble();
        double n;
        n=sc.nextDouble();
        System.out.println("The output of different mathematical functions are:");
        System.out.println("Square root of "+m+" ="+Math.sqrt(m));
        System.out.println("Minimum value between "+m+" & "+n+" ="+Math.min(m,n));
        System.out.println("Maximum value between "+m+" & "+n+" ="+Math.max(m,n));
        System.out.println(+m+" raised to the power 3 = "+Math.pow(m,3));
        System.out.println("Natural log of "+m+" = "+Math.log(m));
        System.out.println("Absolute value of their difference = "+(float)Math.abs(m-n));
        System.out.println("Rounded value of "+m+" = "+Math.round(m));
        System.out.println("The floor value of "+m+" = "+Math.floor(m));
        System.out.println("The ceil value of "+m+" = "+Math.ceil(m));
        System.out.println("Truncated value of "+m+" = "+Math.rint(m));
        System.out.println("Exponent value of "+m+" = "+Math.exp(m));
    }
}
                        
                     
                    