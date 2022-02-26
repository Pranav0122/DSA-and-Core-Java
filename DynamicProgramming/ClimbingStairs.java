package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {

     private static int climbStairs(int n,int[] cache){
         if(n==0)
             return 1;
         if(n<0)
             return 0;

         if(cache[n]!=-1)
             return cache[n];

         int s1=climbStairs(n-1,cache);
         int s2=climbStairs(n-2,cache);

         return cache[n]=s1+s2;

     }
    public static void main(String[] args) {
         int n=3;
         int[] cache=new int[n+1];
        Arrays.fill(cache,-1);
        System.out.println(climbStairs(n,cache));
    }
}
