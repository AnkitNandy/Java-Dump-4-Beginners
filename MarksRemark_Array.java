import java.util.*;
class MarksRemark_Array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        String name[] = new String[n];
        int rno[] = new int[n];
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        double avg[]=new double[n];
        System.out.println("There are "+n+" student.");
        for (int i=0;i<n;i++)
        {
            System.out.println("\nEnter name of student "+(i+1)+":");
            name[i]=sc.next();
            System.out.println("Enter roll no. of "+name[i]+":");
            rno[i]=sc.nextInt();
            System.out.println("Enter "+name[i]+"'s marks in three subjects line by line:");
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            avg[i] = (double)(a[i]+b[i]+c[i])/3.0;
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
            if (avg[i]<40)
            System.out.println(name[i]+" is POOR.");
            else if (avg[i]<=59)
            System.out.println(name[i]+" is PASS.");
            else if (avg[i]<=74)
            System.out.println(name[i]+" is FIRST CLASS.");
            else if (avg[i]<=84)
            System.out.println(name[i]+" is DISTINCTION.");
            else
            System.out.println(name[i]+" is EXCELLENT.");
        }
    }
}