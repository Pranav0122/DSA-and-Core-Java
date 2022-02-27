package MCMPattern;

public class Mixtures {
    private static int colorSum(int[] arr,int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        return sum%100;
    }
    private static int mixtures(int[] arr,int l,int r){
        if(l>=r)
            return 0;

        int minCost=Integer.MAX_VALUE;
        for(int part=l;part<r;part++){
            int p1=mixtures(arr,l,part);
            int p2=mixtures(arr,part+1,r);
            int indCost=colorSum(arr,l,part)*colorSum(arr,part+1,r);
            int cost=p1+p2+indCost;
            minCost=Math.min(minCost,cost);
        }
        return minCost;
    }
    public static void main(String[] args) {
        int[] arr={40,60,20};
        System.out.println(mixtures(arr,0,arr.length-1));
    }
}
