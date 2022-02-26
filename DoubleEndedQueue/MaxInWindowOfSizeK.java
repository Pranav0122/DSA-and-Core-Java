package DoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class  MaxInWindowOfSizeK {
    public static void main(String[] args) {
        int[] nums={1,4,2,5,8,7};
        int k=3;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i< nums.length;i++){
            while (!dq.isEmpty() && nums[dq.getLast()]<=nums[i])
                dq.removeLast();
            dq.addLast(i);
            if(dq.getFirst()==i-k)
                dq.removeFirst();
            if(i>=k-1)
                System.out.println(nums[dq.getFirst()]);

        }
    }
}
