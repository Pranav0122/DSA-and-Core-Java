package MapQPS;

import java.util.HashMap;
import java.util.Map;

public class CountNicePairs {
    private static int reverse(int num){
        int newNum=0;
        while (num>0){
            int r=num%10;
            newNum=newNum*10+r;
            num/=10;
        }
        return newNum;
    }
    public static void main(String[] args) {
        int[] arr={42,11,1,97};
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int diff=curr-reverse(arr[i]);
            if(map.containsKey(diff)){
                count=(count+map.get(diff));
            }
            map.put(diff, map.getOrDefault(diff,0)+1);
        }
        System.out.println(count);
    }
}
