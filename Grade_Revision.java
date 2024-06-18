/**The basic salary of employees is undergoing a revision. Define a class called
 * Grade_Revision with the following specifications:
 * 
 * DATA MEMBERS -->
 * String name : to store the name of the employee
 * int bas : to store basic salary
 * int expn : to consider length of service as an experience
 * double inc : to store increment
 * double nbas : to store new basic salary(basic + increment)
 * 
 * METHODS -->
 * Grade_Revision() : default constructor to initialize all data members
 * void accept() : to input name, basic and experience from the user.
 * void increment() : to calculate increment with the following specifications - 
 * 
 *      EXPERIENCE                       INCREMENT
 *    Upto 3 years                 Rs.1000 + 10% of basic
 *     3 - 5 years                 Rs.3000 + 12% of basic
 *    5 - 10 years                 Rs.5000 + 15% of basic
 *    Above 10 years               Rs.8000 + 18% of basic 
 */
import java.util.*;
class Grade_Revision
{
    String name;
    int bas,expn;
    double inc,nbas;
    Grade_Revision()
    {
        name="";
        bas=0;
        expn=0;
        inc=0.0;
        nbas=0.0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the employer:");
        name=sc.nextLine();
        System.out.println("Enter the Basic Salary of "+name+":");
        bas=sc.nextInt();
        System.out.println("Enter the Experience in terms of Length of Service(in years):");
        expn=sc.nextInt();
    }
    void increment()
    {
        if (expn<=3)
        inc = 1000 + ((10.0/100.0)*bas);
        else if (expn<=5)
        inc = 3000 + ((12.0/100.0)*bas);
        else if (expn<=10)
        inc = 5000 + ((15.0/100.0)*bas);
        else
        inc = 8000 + ((18.0/100.0)*bas);
        System.out.println("\nThe employer's Increment is Rs. "+inc);
    }
    public static void main()
    {
        Grade_Revision obj = new Grade_Revision();
        System.out.println("\t\tWELCOE TO EMPLOYER GRADE REVISION");
        obj.accept();
        obj.increment();
    }
}