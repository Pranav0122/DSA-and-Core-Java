package Arrays;

import java.util.Scanner;

public class reverseArray {
    static void recursiveReverseArray(int[] arr,int start,int end){
        if(start>end)
            return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        recursiveReverseArray(arr,start+1,end-1);
        return;
    }
    static void iterativeReverseArray(int[] arr,int end){
        int start=0;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
    static void printArray(int[] arr){
        for (int j : arr) System.out.println(j);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        iterativeReverseArray(arr,size-1);
        printArray(arr);
        System.out.println(5);
        recursiveReverseArray(arr,0,size-1);
        for (int j : arr) System.out.println(j);
    }
}
