import java.util.*;
class ItemCost_Array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items :-");
        int n=sc.nextInt();
        System.out.println("Enter name of an item and its price line by line :-");
        String name[] = new String[n];
        int price[] = new price[n];
        for (int i=0;i<n;i++)
        {
            name[i] = sc.next();
            price[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("\nYour Item List in Ascending Order of its Name:");
        String swap="",p=0;
        for (int i=n-1;i>=0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if (name[j+1].compareTo(name[j]) < 0)
                {
                    swap=name[j];
                    p=price[j];
                    name[j]=name[j+1];
                    price[j]=price[j+1];
                    name[j+1]=swap;
                    price[j+1]=p;
                }
            }
        }
        for (int i=0;i<n;i++)
        System.out.println(name[i]+" - Rs."+price[i]);
    }
}