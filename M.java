class Num
{
    int ar[];
    Num()
    {
        ar=new int[20];
    }
    void Random()
    {
        int i,j,f,r;
        for (i=0;i<20;i++)
        {
            f=0;
            r=1+(int)(Math.random()*20);
            for (j=0;j<i;j++)
            {
                if (ar[j]==r)
                f=1;
            }
            if (f==0)
            ar[i]=r;
            else
            i--;
        }
    }
    void display()
    {
        System.out.println("Contents of ar[] are:");
        for (int i=0;i<20;i++)
        System.out.println(ar[i]);
    }
}
public class M
{
    public static void main()
    {
        Num obj=new Num();
        obj.Random();
        obj.display();
    }
}