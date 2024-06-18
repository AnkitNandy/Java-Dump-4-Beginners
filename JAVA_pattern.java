/**J A V A
 *   A V A
 *     V A
 *       A
 */
class JAVA_pattern
{
    static void main()
    {
        String s="JAVA";
        int len=s.length();
        for (int i=0;i<len;i++)
        {
            for (int k=0;k<i*2;k++)
            {
                System.out.print(" ");
            }
            for (int j=i;j<len;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
            