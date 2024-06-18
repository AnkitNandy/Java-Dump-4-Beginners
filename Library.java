//Pg 391 in textbook
import java.util.*;
class Library
{
    int acc_num;
    String title,author;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Accession Number of the book:");
        acc_num = sc.nextInt();
        System.out.println("Enter the book Title:");
        title = sc.nextLine();
        System.out.println("Enter its Author Name:");
        author = sc.nextLine();
    }
    void compute()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the number of days late for submitting the book:");
        int d=sc.nextInt();
        int fine = 2*d;
        System.out.println("\nFine to be Paid = Rs."+fine);
    }
    void display()
    {
        System.out.println("\nACCESSION NUMBER          TITLE             AUTHOR");
        System.out.println(acc_num+"      "+title+"        "+author);
    }
    public static void main()
    {
        Library obj = new Library();
        obj.input();
        obj.compute();
        obj.display();
    }
}