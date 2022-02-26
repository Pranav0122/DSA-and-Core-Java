package Sorting;

public class BubbleSort {
    public void simpleSort(int[] arr){
        privateSimpleSort(arr);
    }
    private void privateSimpleSort(int[] arr){
        int n=arr.length;
        System.out.println(arr);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void optimizedSortApproach(int[] arr){
        privateOptimizedSortApproach(arr);
    }
    private void privateOptimizedSortApproach(int[] arr){
        int n=arr.length;
        System.out.println(arr);
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
                break;
        }
    }
}
