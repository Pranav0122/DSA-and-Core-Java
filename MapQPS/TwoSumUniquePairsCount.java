package MapQPS;

public class TwoSumUniquePairsCount {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,2,3,3,3,24,25,25};
        int target=27;
        int l=0,r=arr.length-1,count=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                l++;
                r--;
                count++;
                while(l<r && arr[l]==arr[l-1])
                    l++;
            }else if(sum>target){
                r--;
            }else {
                l++;
            }
        }
        System.out.println(count);
    }
}
