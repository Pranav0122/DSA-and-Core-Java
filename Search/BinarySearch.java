package Search;

public class BinarySearch {
    public int iterativApproach(int[] arr,int search){
        return privateIterativeApproach(arr,search);
    }
    private int privateIterativeApproach(int[] arr,int search){
        int hi=arr.length-1,lo=0,mid;
        while(lo<=hi){
            mid=lo+(hi-lo)/2;
            if(arr[mid]==search)
                return mid;
            else if(arr[mid]<search)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }
    public int recursiveApproac(int[] arr,int search){
        return recursiveAppraoch(arr,0,arr.length-1,search);
    }
    public int recursiveAppraoch(int[] arr,int lo,int hi,int search){
        if(hi>=lo){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==search)
                return mid;
            else if(arr[mid]<search)
                return recursiveAppraoch(arr,mid+1,hi,search);
            else
                return recursiveAppraoch(arr,lo,mid-1,search);
        }
        return -1;
    }
}
