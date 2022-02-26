package Sorting;

public class SortingClient {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};

        //---------BUBBLE SORT-------
//        BubbleSort bs=new BubbleSort();
//        bs.simpleSort(arr);
//        bs.optimizedSortApproach(arr);


        //---------SELECTION SORT---------
//        SelectionSort ss=new SelectionSort();
//        ss.sort(arr);


        //----------INSERTION SORT---------
//        InsertionSort is=new InsertionSort();
//        is.sort(arr);
//        System.out.println(arr);
//        for(int i:arr)
//            System.out.print(i+" ");

        //-----------MERGE SORT------------
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        MergeSort ms=new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);
        for(int i:arr)
            System.out.print(i+" ");
    }
}
