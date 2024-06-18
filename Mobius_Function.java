/**The MOBIUS function M(N) for a natural number 
 * is defined as follows:
 * M(N) = 1 if N = 1
 * 
 * = 0 if any prime factor of N is contained in N 
 * than once.
 * 
 * = (-1)^P if N is a product of P distinct factors.
 * 
 * Example : M(78) = -1(for 78 = 2*3*13) 
 *           M(78) = (-1)^3 = -1
 *           
 *           M(34) = 1(for 34 = 2*17)
 *           M(34) = (-1)^2 = 1
 *           
 *           M(12) = 0(for 12 = 2*2*3 and 2 appears
 *           2 times)
 *           
 *           M(17) = -1(for 17 = 17)
 *           M(17) = (-1)^1 = -1
 *           
 *Input natural number N and output M(N).
 */
import java.util.*;
class Mobius_Function
{
    void MOBIUS(int N)
    {
        int i,j;
        int arr[] = new int[10];
        int k=0,cnt=0;
        if (N==1)
        System.out.println("M(N) = 1.");
        else
        {
            while (N!=1)
            {
                for (i=2;i<=N;i++)
                {
                    if (N%i==0)
                    {
                        cnt=0;
                        for (j=1;j<=i;j++)
                        {
                            if (i%j==0)
                            cnt++;
                        }
                        if (cnt==2)
                        {
                            arr[k] = i;
                            N = N/i;
                        }
                        k++;
                    }
                }
            }
            System.out.println("The prime factors of "+N+" are :");
            for (i=0;i<k;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}