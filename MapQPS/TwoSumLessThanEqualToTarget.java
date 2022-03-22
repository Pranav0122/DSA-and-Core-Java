package MapQPS;

public class TwoSumLessThanEqualToTarget {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,15};
        int l=0,r=arr.length-1;
        int targetSum=14,count=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum<=targetSum){
                count+=r-l;
                l++;
            }else
                r--;
        }
        System.out.println(count);
    }
}
