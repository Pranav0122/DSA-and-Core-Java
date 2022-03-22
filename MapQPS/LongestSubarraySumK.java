package MapQPS;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK  {
    private static void sumK(int[] arr,int k){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                int len=i+1;
                maxLen=Math.max(maxLen,len);
            }else if(map.containsKey(sum-k)){
                int len=i-map.get(sum-k);
                maxLen=Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        int[] arr={10, 5, 2, 7, 1, 9};
        int k=15;
        sumK(arr,k);
    }
}
