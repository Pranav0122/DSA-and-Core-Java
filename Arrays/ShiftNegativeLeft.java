package Arrays;

public class ShiftNegativeLeft {
    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
        //--------SIMPLE APPROACH---------
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        //------------TWO-POINTER APPROACH------------
//        int l=0,r=arr.length-1;
//        while(l<r){
//            if(arr[l]<0 && arr[r]<0){
//                l++;
//            }
//            else if(arr[l]>0 && arr[r]<0){
//                int temp=arr[l];
//                arr[l]=arr[r];
//                arr[r]=temp;
//                l++;
//                r--;
//            }
//            else if(arr[l]<0 && arr[r]>0){
//                l++;
//                r--;
//            }
//            else
//                r--;
//        }
        for(int i:arr)
            System.out.print(i+" ");
    }
}
