package Arrays;

public class RotateByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        //Simple approach
//        int x=arr[n-1];
//        for(int i=n-1;i>0;i--)
//            arr[i]=arr[i-1];
//        arr[0]=x;

        //TWO-POINTER APPROACH
        int l=0,r=n-1;
        while(l!=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
