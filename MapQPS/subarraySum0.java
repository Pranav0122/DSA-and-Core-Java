package MapQPS;

import java.util.HashMap;
import java.util.Map;

public class subarraySum0 {
    private static void sum0(int[] arr){
        int sum=0;
        int l=-1,r=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){//case1: running sum is 0
                l=0;
                r=i;
                break;
            }
            else if(map.containsKey(sum)){// case2: repeating sum case
                l=map.get(sum)+1;
                r=i;
                break;
            }
            else {//na kahin dekha na hi zero to put
                map.put(sum,i);//sum[0,i]
            }

        }
        System.out.println(l+" "+r) ;
    }
    public static void main(String[] args) {
        int[] arr={-3,1,-4,2,-3,4};
        sum0(arr);
    }
}
