package MCMPattern;

public class MCM {
    private static int mcm(int[] arr,int l,int r){

        if(l>=r)
            return 0;

        int minCost=Integer.MAX_VALUE;

        for(int part=l;part<r;part++){
            int c1=mcm(arr,l,part);
            int c2=mcm(arr,part+1,r);
            int cost=c1+c2+arr[l-1]*arr[part]*arr[r];
            minCost=Math.min(cost,minCost);
        }
        return  minCost;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println(mcm(arr,1,arr.length));
    }
}
