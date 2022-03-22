package MapQPS;

public class TwoSumClosest {
    public static void main(String[] args) {
        int[] arr={2,5,6,8,15};
        int target=12;
        int l=0,r=arr.length-1;
        int closestS=arr[0]+arr[1];
        while(l<r){
            int currS=arr[l]+arr[r];
            if(Math.abs(target-currS)<Math.abs(target-closestS)){
                closestS=currS;
            }
            if(currS>target) {
                r--;
            }else {
                l++;
            }
        }
        System.out.println(closestS);
    }
}
