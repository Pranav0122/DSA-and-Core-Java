package Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int low = 0, high = arr.length-1, mid = 0;
        while(mid <= high){
            if(arr[mid]==0) {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            } else if(arr[mid]==1) {
                mid++;
            } else {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int i:arr)
            System.out.print(i+" ");
    }
}
