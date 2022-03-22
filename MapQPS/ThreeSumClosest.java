package MapQPS;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr={-1,2,1,-4};
        int target=1;
        int closestS=arr[0]+arr[1]+arr[2];
        for(int i=0;i< arr.length-2;i++){
            int l=i+1,r=arr.length-1;
            while (l<r){
                int currS=arr[i]+arr[l]+arr[r];
                if(Math.abs(target-currS)<Math.abs(target-closestS)){
                    closestS=currS;
                }
                if(currS>target) {
                    r--;
                }else {
                    l++;
                }
            }
        }
    }
}
