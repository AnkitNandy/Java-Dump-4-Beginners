//Pg 428 in textbook
import java.util.*;
class MovieMagic
{
    int year;
    String title;
    float rating;
    MovieMagic()
    {
        year=0;
        rating=0.0F;
        title="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Year of Release:");
        year=sc.nextInt();
        System.out.println("Movie Title:");
        title=sc.next();
        System.out.println("Movie Rating");
        rating=sc.nextFloat();
    }
    void display()
    {
        String s="";
        if (rating<=2.0)
        s = "FLOP";
        else if (rating<=3.4)
        s = "SEMI-HIT";
        else if (rating<=4.5)
        s = "HIT";
        else
        s = "SUPER-HIT";
        System.out.println("\nThe movie \""+title+"\" is "+s);
    }
    public static void main()
    {
        MovieMagic obj = new MovieMagic();
        obj.accept();
        obj.display();
    }
}