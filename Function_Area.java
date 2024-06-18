import java.util.*;
class Function_Area
{
    double area(double r,int r1)
    {
        double area=0.0;
        area=r*r1;
        return area;
    }
    double area(double side)
    {
        double area=0.0;
        area=side*side;
        return area;
    }
    double area(double length,double breadth)
    {
        double area=0.0;
        area=length*breadth;
        return area;
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("(a)Circle\n(b)Square\n(c)Rectangle");
        System.out.println("Enter your choice among 'a','b'or'c' to find the area of any one of these figures :");
        char c=sc.next().charAt(0);
        Function_Area obj=new Function_Area();
        switch(c)
        {
            case 'a':
            System.out.println("Enter the radius of circle:");
            double r=sc.nextDouble();
            int r1=sc.nextInt();
            double s1=obj.area(r,r1);
            System.out.println("Area = "+s1);
            break;
            case 'b':
            System.out.println("Enter the side of square:");
            double side=sc.nextDouble();
            double s2=obj.area(side);
            System.out.println("Area = "+s2);
            break;
            case 'c':
            System.out.println("Enter the length and breadth of rectangle:");
            double length=sc.nextDouble();
            double breadth=sc.nextDouble();
            double s3=obj.area(length,breadth);
            System.out.println("Area = "+s3);
            break;
            default:
            System.out.println("Wrong Choice!!");
        }
    }
}