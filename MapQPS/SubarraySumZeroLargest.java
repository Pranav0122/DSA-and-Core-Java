package MapQPS;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumZeroLargest {
    private static void longestLengthSum0(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                int len=i+1;
                maxlen=Math.max(maxlen,len);
            }else if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxlen=Math.max(maxlen,len);
            }else {
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        longestLengthSum0(arr);
    }
}
