//To display the total marks and average marks
public class Marks
{
    public static void main(int phy, int chem, int bio)
    {
        int sum;
        double avg=0.0F;
        sum=(phy+chem+bio);
        avg=sum/3.0;
        System.out.println("The total Marks = "+sum);
        System.out.println("The Average Marks = "+avg);
    }
}