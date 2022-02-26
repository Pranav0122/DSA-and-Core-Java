package DynamicProgramming;
import java.util.Arrays;
public class nthFibonnaciNumber {
    private static long nthfib(int n,long[] cache){
        if(n<=1)
            return n;
        if(cache[n]!=-1)
            return cache[n];
        long fibN_1=nthfib(n-1,cache);
        long fibN_2=nthfib(n-2,cache);
        return cache[n]=fibN_1+fibN_2;//storing
    }

    public static void main(String[] args) {
        int n=50;
        long[] cache=new long[n+1];
        Arrays.fill(cache,-1);
        System.out.println(nthfib(n,cache));
    }
}
