package Vaisehi;

public class count {
    public static void main(String[] args) {

        int[] a={6,1,2,7};
        int k=10;
        int[] arr=new int[a.length];
        arr[0]=a[0];
        for(int i=1;i<a.length;i++){
            arr[i]=arr[i-1]+a[i];
        }
        long count=0;
        int last=a.length-1;
//        if(arr[last]<k)
//            return count;

        for(;last>0;last--){
            if(arr[last]>k)
                count++;
            for(int l=0;l<last;l++){
                int dif=arr[last]-arr[l];
                if(dif>=k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
