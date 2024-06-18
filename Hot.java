/**Accept a string. Modify the string by adding
 * 'hot' at the beginning of the word. If the
 * string already contains 'hot', then the string
 * remains unchanged. Print the modified string
 * and the message accordingly.
 */
import java.util.*;
class Hot
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Java program to add the word 'hot' before a string ?\n");
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.toUpperCase();
        s=s.trim();
        if (s.contains("HOT"))
        System.out.println("New string =\n"+s+"\n"+"No change in the string because 'HOT' is already present!!");
        else
        System.out.println("New string =\n"+"HOT"+s); 
    }
}