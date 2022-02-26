package Vaisehi;

import java.util.*;
public class Main
{
    public static int[] talent(int ar[],int n,int k){
        Set<Integer> hs;
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<=n-k;i++){
            int j=i;
            hs=new HashSet<>();
            int count=0;
            while(hs.size()!=k && j<n){
                if(hs.contains(ar[j])){
                    j++;
                    count++;
                }
                else{
                    count++;
                    hs.add(ar[j++]);
                }
            }
            if(hs.size()==k)
                arr[i]=count;

        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] ar={1,1,2,2,3,1,3,2};
        int[] a=talent(ar,8,3);
        for(int ab:a)
            System.out.println(ab+" ");
    }
}