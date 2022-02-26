package Search;

public class LinearSearch {
    public int search(int[] arr,int check){
        return searchPrivate(arr,check);
    }
    private int searchPrivate(int[] arr,int check){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==check)
                return i;
        }
        return -1;
    }
    public int modifiedSearch(int[] arr,int search){
        return modifiedSearchPrivate(arr,search);
    }
    //Adding 2 if statements
    private int modifiedSearchPrivate(int[] arr,int check){
        int hi=arr.length-1,lo=0;
        while(lo<=hi){
            if(arr[lo]==check)
                return lo;
            if(arr[hi]==check)
                return hi;
            lo++;
            hi--;
        }
        return -1;
    }
}
