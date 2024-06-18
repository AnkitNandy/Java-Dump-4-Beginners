/**Enter record of employees of company as emp number,age,
 * and basic salary. Calculate gross salary and net salary.
 * House Rent Allowance - 40% of basic salary
 * Provident Fund - 12% of basic salary
 * Employee Provident Fund - 2% of basic salary
 * Even check if the employee is an income tax payer or not
 * by these conditions:
 * Male - upto Rs 250000 - Not an income tax payer
 * Female - upto Rs 300000 - Not an income tax payer
 */
import java.util.*;
public class GrossandNetSalary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int age,num;
        char a;
        double basic,da,hra,pf,epf,gs,ns;
        System.out.println("Enter name of employee:-");
        name=sc.nextLine();
        System.out.println("Enter age of "+name+" :-");
        age=sc.nextInt();
        System.out.println("Enter the employee number:-");
        num=sc.nextInt();
        System.out.println("Enter basic salary of "+name+" :-");
        basic=sc.nextDouble();
        hra=(40.0/100.0)*basic;
        pf=(12.0/100.0)*basic;
        epf=(2.0/100.0)*basic;
        da=hra+pf+epf;
        gs=basic+da+hra;
        ns=gs-(pf+epf);
        System.out.println(name+"'s gross salary is Rs "+gs);
        System.out.println(name+"'s net salary is Rs "+ns);
        System.out.println("Press M for male and F for female");
        System.out.println("Enter the option:-");
        a=sc.next().charAt(0);
        switch(a)
        {
        case 'M':
        {
            if (gs<=250000)
            System.out.println(name+" is not an income tax payer.");
            else
            System.out.println(name+" is an income tax payer.");
        }
        break;
        case 'F':
        {
            if (gs<=300000)
            System.out.println(name+" is not an income tax payer.");
            else
            System.out.println(name+" is an income tax payer.");
        }
        break;
        default:
        System.out.println("Wrong option entered!!");
        }
    }
}
        