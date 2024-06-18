/**In an examination, the grades
 * are given to the students on
 * the basis of average marks obtained.
 * Write a program to input name and average marks
 * that displays the grade along with the name accordingly:
 *           MARKS                             GRADES
 *        80% and above                      Distinction
 * 60% or more but less than 80%           First Division
 * 45% or more but less than 60%          Second Division
 * 40% or more but less than 45%                Pass
 *       Less than 40%                        No Grade
 */
import java.util.*;
public class Grades
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m;
        String name;
        float avg;
        System.out.println("          MARKS                              GRADES");  
        System.out.println("        80% and above                      Distinction");
        System.out.println(" 60% or more but less than 80%           First Division");
        System.out.println(" 45% or more but less than 60%          Second Division");
        System.out.println(" 40% or more but less than 45%                Pass");
        System.out.println("       Less than 40%                        No Grade");
        System.out.println("Enter name of the student:-");
        name=sc.nextLine();
        System.out.println("Enter "+name+"'s marks percentage:-");
        avg=sc.nextFloat();
        if (avg>=80)
        System.out.println("DISTINCTION");
        else if (avg>=60&&avg<80)
        System.out.println("FIRST DIVISION");
        else if (avg>=45&&avg<60)
        System.out.println("SECOND DIVISION");
        else if (avg>=40&&avg<45)
        System.out.println("THANK GOD!!"+"\n"+"YOU HAVE JUST PASSED.");
        else if (avg<40)
        System.out.println("SORRY!!"+"\n"+"NO GRADE FOR "+name+".");
        else
        {
            if (avg<0)
            {
            System.out.println("You might have entered the marks percentage less than 0%.");
            System.out.println("It is actually not possible!!");
            }
            if (avg>100)
            {
            System.out.println("You might have entered the marks percentage more than 100%.");
            System.out.println("Extra marks is not possible!!");
            }
        }
    }
}
        