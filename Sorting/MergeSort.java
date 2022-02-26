package Sorting;

public class MergeSort {
    public void mergeSort(int[] arr,int lo,int hi){
        privateMergeSort(arr,lo,hi);
    }
    private void privateMergeSort(int[] arr,int lo,int hi){
        if(lo<hi){
            int mid=(lo+hi)/2;
            privateMergeSort(arr,lo,mid);
            privateMergeSort(arr,mid+1,hi);
            merge(arr,lo,mid,hi);
        }
    }
    private void merge(int[] arr,int lo,int mid,int hi){
        int n1=mid-lo+1;
        int n2=hi-mid;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(int i=0;i<n1;i++)
            L[i]=arr[i+lo];
        for(int i=0;i<n2;i++)
            R[i]=arr[mid+1+i];
        int l=0,r=0,m_idx=lo;
        while (l<n1 && r<n2){
            if(L[l]<=R[r]){
                arr[m_idx]=L[l];
                l++;
            }
            else {
                arr[m_idx]=R[r];
                r++;
            }
            m_idx++;
        }
        while(l<n1){
            arr[m_idx]=L[l];
            l++;
            m_idx++;
        }
        while(r<n2){
            arr[m_idx]=R[r];
            r++;
            m_idx++;
        }
    }
}
