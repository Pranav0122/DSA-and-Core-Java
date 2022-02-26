package Sorting;

public class InsertionSort {
    public void sort(int[] arr){
        privateSort(arr);
    }
    private void privateSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 &&key<arr[j]){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
}
