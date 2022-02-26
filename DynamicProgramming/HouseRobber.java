package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
//From zero position
//    private static int robHouses(int[] houses,int curr,int n,int[] cache){
//
//        if(curr>=n)
//            return 0;
//        if(cache[curr]!=-1)
//            return cache[curr];
//
//        int rob=robHouses(houses,curr+2,n,cache)+houses[curr];
//        int donRob=robHouses(houses,curr+1,n,cache);
//
//        return cache[curr]=Math.max(rob,donRob);
//    }

//    From nth  position
    private static int robHouses(int[] houses,int n,int[] cache){

        if(n<=0)
            return 0;
        if(cache[n]!=-1)
            return cache[n];

        int rob=robHouses(houses,n-2,cache)+houses[n-1];
        int donRob=robHouses(houses,n-1,cache);

        return cache[n]=Math.max(rob,donRob);
    }
    public static void main(String[] args) {
        int[] houses={5,1,3,6};
        int[] cache=new int[5];
        Arrays.fill(cache,-1);
        System.out.println(robHouses(houses,4,cache));
    }
}
