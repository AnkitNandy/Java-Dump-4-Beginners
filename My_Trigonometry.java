//A program to illustrate Trigonometrical Functions
public class My_Trigonometry
{
    public static void main(String args[])
    {
        double m=30, n=60, p=45;
        double x,y,z;
        //We must convert angles in radians
        x=(22.0/(7.0*180.0))*m;
        y=(22.0/(7.0*180.0))*n;
        z=(22.0/(7.0*180.0))*p;
        System.out.println("The Trigonometrical values are:-\t"+"The value of Sin 30 degree = "+Math.sin(x));
        System.out.println("                                        The value of Cos 60 degree = "+Math.cos(y));
        System.out.println("                                        The value of Tan 45 degree = "+Math.tan(z));
    }
}