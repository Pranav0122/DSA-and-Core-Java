package MapQPS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwoPass {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=26;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            map.put(nums[i],i);//Building
        }
        int[] ans=new int[2];
        for(int i=0;i< nums.length;i++){
            int curr=nums[i];
            int diff=target-curr;
            if(map.containsKey(diff) && i!=map.get(diff)){//Searching
                int index=map.get(diff);
                ans[0]=i;
                ans[1]=index;
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
