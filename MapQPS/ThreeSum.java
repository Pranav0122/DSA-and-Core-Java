package MapQPS;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-3,-3,-3,0,0,3,3,3};
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int l=i+1,r= arr.length-1;
            while (l<r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum==0){
                    System.out.println(arr[i]+" "+arr[l]+" "+" "+arr[r]);
                    l++;
                    r--;
                    while(l<r && arr[l]==arr[l-1])
                        l++;
                }else if(sum>0){
                    r--;
                }else {
                    l++;
                }
            }
        }
    }
}
