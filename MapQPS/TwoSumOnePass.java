package MapQPS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOnePass {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=26;
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i< nums.length;i++){
            //Building and Searching simultaneously
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                ans[0]=map.get(diff);
                ans[1]=i;
            }
            map.put(nums[i],i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
