package Vaisehi;
import java.util.*;
import java.lang.*;
import java.io.*;
public class gfg {
    private static int check (int i)
    {
        int quad = 0, product = 1;
        while (i > 0)
        {
            int r = i % 10;
            quad += Math.pow (i, 4);
            product *= r;
            i /= 10;
        }
        return gcd(quad, product);
    }
    private static int gcd (int quad, int product)
    {
        if (product == 0)
            return quad;

        return gcd(product, quad % product);
    }
    public static void main (String[]args)
    {
        //code
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt ();
        while (t-- > 0)
        {
            int count = 0;
            int n = sc.nextInt ();
            for (int i = 2; i <= n; i++)
            {
                int g = check(i);
                if (g == i)
                {
                    count++;
                }
            }
            System.out.println (count);
        }
    }
}
