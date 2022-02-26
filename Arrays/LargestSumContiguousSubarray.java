package Arrays;

public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        long max_so_far=a[0],max_end=0,min_max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){

            if(max_end<0){
                max_end=0;
                min_max=Math.max(min_max,a[i]);
            }
            max_end=max_end+a[i];
            max_so_far=Math.max(max_end,max_so_far);
        }
        if(max_end==0 && max_so_far==0)
            System.out.println(min_max);
        else
        System.out.println(max_so_far);
    }
}
