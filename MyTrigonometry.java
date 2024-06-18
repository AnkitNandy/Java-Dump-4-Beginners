/*Program to find the
 * the sin, cos and tan values 
 * of a given angle(in radians).
 * Or to provide the angle corresponding
 * to the given sin, cos or tan value
 * depending upon the user's choice.
 */
import java.util.*;
public class MyTrigonometry
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE WORLD OF TRIGONOMETRY");
        char choice;
        System.out.println("Press 'A' to find the sin,cos or tan values of a given angle");
        System.out.println("Press 'B' to find the angle corresponding to the given sin,cos or tan value");
        System.out.println("Enter your choice out of 'A' or 'B':-");
        choice=sc.next().charAt(0);
        switch(choice)
        {
            case 'A':
            float ang,rad;
            double val1,val2,val3;
            System.out.println("Enter the angle in degrees:-");
            ang=sc.nextFloat();
            rad=22/(7*180)*ang;
            val1=Math.sin(rad);
            val2=Math.cos(rad);
            val3=Math.tan(rad);
            System.out.println("Sin value of "+ang+" is "+val1);
            System.out.println("Cos value of "+ang+" is "+val2);
            System.out.println("Tan value of "+ang+" is "+val3);
            break;
            case 'B':
            double c,deg1,deg2,deg3,val4,val5,val6;
            System.out.println("Enter the value in sin, cos or tan here:-");
            c=sc.nextDouble();
            val4=Math.sin(c);
            val5=Math.cos(c);
            val6=Math.tan(c);
            System.out.println("Angle corresponding to sin value "+c+" is "+val4+" degrees.");
            System.out.println("Angle corresponding to cos value "+c+" is "+val5+" degrees.");
            System.out.println("Angle corresponding to tan value "+c+" is "+val6+" degrees.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
        }
    }
}