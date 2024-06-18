import java.util.*;
public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_price;
    FruitJuice()
    {
        product_code=0;
        flavour="";
        pack_type="";
        pack_size=0;
        product_price=0;        
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product code number:");
        product_code=sc.nextInt();
        System.out.println("Enter the flavour of the juice:");
        flavour=sc.next();
        System.out.println("Enter the type of packaging:");
        pack_type=sc.next();
        System.out.println("Enter the pack size:");
        pack_size=sc.nextInt();
        System.out.println("Enter the product price:");
        product_price=sc.nextInt();
    }
    void discount()
    {
        product_price-=10;
    }
    void display()
    {
        System.out.println("Product Code : "+product_code);
        System.out.println("Flavour : "+flavour);
        System.out.println("Pack Type : "+pack_type);
        System.out.println("Pack Size : "+pack_size);
        System.out.println("Product Price : "+product_price);
    }
    public static void main()
    {
        FruitJuice obj=new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}       