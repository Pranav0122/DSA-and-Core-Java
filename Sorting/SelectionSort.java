package Sorting;

import java.util.ArrayDeque;
import java.util.Deque;

public class SelectionSort {
//    public void sort(int[] arr){
//        privateSort(arr);
//    }
//    private void privateSort(int[] arr){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int min=i;
//            for(int j=i+1;j<n;j++){
//                if(arr[j]<arr[min]) {
//                    min = j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[min];
//            arr[min]=temp;
//        }
public static void main(String[] args) {
    int[] arr={2,5,9,8};
    Deque<Integer> deque = new ArrayDeque<>();
    for(int i=0;i<arr.length;i++){
        if(i%2==0)
            deque.addFirst(arr[i]);
        else
            deque.addLast(arr[i]);
    }

}
}
